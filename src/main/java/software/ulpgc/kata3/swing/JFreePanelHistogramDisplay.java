package software.ulpgc.kata3.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;
import software.ulpgc.kata3.HistogramDisplay;
import software.ulpgc.kata3.Histogram;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JFreePanelHistogramDisplay extends JPanel implements HistogramDisplay {

    @Override
    public void show(Histogram histogram) {
        add(new ChartPanel(chartOf(histogram)));
    }

    private JFreeChart chartOf(Histogram histogram) {
        JFreeChart chart = ChartFactory.createHistogram(histogram.title(), histogram.xAxis(), histogram.yAxis(),
                dataset(histogram.data(),histogram.bins()));
        XYPlot plot = (XYPlot) chart.getPlot();
        XYBarRenderer renderer = new XYBarRenderer();
        for(int i = 0; i < histogram.bins(); i++){
            renderer.setSeriesPaint(i, getRandomColor());
        }
        return chart;
    }
    private IntervalXYDataset dataset(double[] data, int bins){
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("x", data, bins);
        return dataset;
    }
    private Paint getRandomColor() {
        Random random = new Random();
        return new Color(random.nextInt(256),random.nextInt(256), random.nextInt(256));
    }
}
