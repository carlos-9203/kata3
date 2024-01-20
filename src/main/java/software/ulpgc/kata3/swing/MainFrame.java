package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.HistogramDisplay;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private HistogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException{
        setTitle("Histogram");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100,900);
        setLocationRelativeTo(null);
        add(createHistogramDisplay());
    }

    public HistogramDisplay histogramDisplay(){
        return histogramDisplay;
    }

    private Component createHistogramDisplay() {
        JFreePanelHistogramDisplay display = new JFreePanelHistogramDisplay();
        histogramDisplay = display;
        return display;
    }
}
