package software.ulpgc.kata3;

import software.ulpgc.kata3.swing.MainFrame;
//kata 3 histograma
public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram("Cantidad de juegos que se compran en una muestra escogida entre amigos", "Intervalo", "Cantidad", new double[]{6,9,4,15,10,3,6,7,12,2}, 4);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
