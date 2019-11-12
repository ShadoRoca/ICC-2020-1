package practica14;
import java.util.List;
import java.io.IOException;
import java.util.LinkedList;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.colors.XChartSeriesColors;

/**
 * Clase que grafica la regresion lineal de puntos dado un archivo CSV
 * @author Rodrigo Liprandi Cortes
 */

import org.knowm.xchart.SwingWrapper;

public class Graficacion {


    /**
     * Metodo para obtener las x's de una lista de arreglos donde cada arreglo representa una coordenada
     * @param l - La lista de arreglos de String
     * @return Arreglo de doubles con el valor de las x's
     */
    public static double[] obtenerXs(List<String[]> l){
        double[] arr = new double[l.size()];
        for (int i = 0 ; i<l.size() ; i++) {

            String[] datos = l.get(i);
            double d = Double.parseDouble(datos[0]);
            arr[i] = d;
            
        }
        return arr;
    }

    /**
     * Metodo para obtener las y's de una lista de arreglos donde cada arreglo representa una coordenada
     * @param l - La lista de arreglos de String
     * @return Arreglo de doubles con el valor de las y's
     */
    public static double[] obtenerYs(List<String[]> l){
        double[] arr = new double[l.size()];
        for (int i = 0 ; i<l.size() ; i++) {

            String[] datos = l.get(i);
            double d = Double.parseDouble(datos[1]);
            arr[i] = d;
            
        }
        return arr;
    }

    public static void main(String[] args) {

        List<String[]> csv = null; 
         try {
             csv = LectorCSV.leer(Graficacion.class.getResource("/317275605.csv").getPath());
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

        double[] xData = obtenerXs(csv);
        double[] yData = obtenerYs(csv);


        int n = csv.size();
        double sumaX = 0;
        double sumaY = 0;
        double sumaXporY = 0;
        for(int i = 0 ; i < xData.length ; i++){
            sumaX += xData[i];
            sumaY += yData[i];
            sumaXporY += xData[i]*yData[i];
        }

        double m = (n*sumaXporY-(sumaX*sumaY))/n*(sumaX*sumaX)-(sumaX*sumaX);

        double b = (sumaY-m*sumaX)/n;

        XYChart chart = new XYChartBuilder()
                            .title("Regresión lineal")
                            .width(800)
                            .height(600)
                            .xAxisTitle("X")
                            .yAxisTitle("Y")
                            .theme(ChartTheme.Matlab)
                            .build();

        chart.getStyler().setPlotBackgroundColor(ChartColor.getAWTColor(ChartColor.GREY));
        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
        chart.getStyler().setPlotGridLinesVisible(false);
        chart.getStyler().setMarkerSize(6);

        XYSeries sampleSeries = chart.addSeries("Observaciones", xData, yData);
        sampleSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
        sampleSeries.setMarkerColor(XChartSeriesColors.RED);

        XYSeries lineSeries = chart.addSeries(
            "Línea", new double[]{2.0, 11.9}, new double[]{9.596375227819768, 10.603005749797925});
        lineSeries.setXYSeriesRenderStyle(XYSeriesRenderStyle.Line);
        lineSeries.setLineColor(XChartSeriesColors.BLUE);
        lineSeries.setLineWidth(3);

        new SwingWrapper<XYChart>(chart).displayChart();

    }

}
