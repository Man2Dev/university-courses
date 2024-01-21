
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import javax.swing.JFrame;

public class LineChartDemo2 extends ApplicationFrame {

	public static ArrayList<Long> times = new ArrayList();
	public static ArrayList<Long> tMax = new ArrayList();
	public static ArrayList<Long> tAvg = new ArrayList();
	public static ArrayList<Long> tMin = new ArrayList();
	public static Long total = (long) 0;

	public LineChartDemo2(String title) {
		super(title);
		JPanel chartPanel = createDemoPanel();
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		setForeground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/resources/graph2.png")));
		setContentPane(chartPanel);
	}

	private static JFreeChart createChart(final XYDataset dataset) {

		JFreeChart chart = ChartFactory.createXYLineChart("Max(Green), Avg(Blue), Min(Red)", "Counter",
				"Time complexity", dataset, PlotOrientation.VERTICAL, false, false, false);

		XYPlot plot = (XYPlot) chart.getPlot();
		plot.setDomainPannable(true);
		plot.setRangePannable(true);

		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer() {
			Stroke soild = new BasicStroke(2.0f);
			Stroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f,
					new float[] { 10.0f }, 0.0f);

			@Override
			public Stroke getItemStroke(int row, int column) {
				if (row == 2) {
					double x = dataset.getXValue(row, column);
					if (x > 4) {
						return dashed;
					} else {
						return soild;
					}
				} else
					return super.getItemStroke(row, column);
			}
		};

		renderer.setBaseShapesVisible(true);
		renderer.setBaseShapesFilled(true);
		renderer.setBaseStroke(new BasicStroke(3));
		plot.setRenderer(renderer);
		return chart;
	}

	public static JPanel createDemoPanel() {
		JFreeChart chart = createChart(createDataset());
		ChartPanel panel = new ChartPanel(chart);
		panel.setMouseWheelEnabled(true);
		return panel;
	}

	private static XYDataset createDataset() {
		// Green.
		XYSeries series1 = new XYSeries("Max");
		for (int i = 0; i < tMax.size(); i++) {
			series1.add(i, tMax.get(i));
		}
		// Blue.
		XYSeries series2 = new XYSeries("Avg");
		for (int i = 0; i < tAvg.size(); i++) {
			series2.add(i, tAvg.get(i));
		}
		// Red.
		XYSeries series3 = new XYSeries("Min");
		for (int i = 0; i < tMin.size(); i++) {
			series3.add(i, tMin.get(i));
		}

		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series1);
		dataset.addSeries(series2);
		dataset.addSeries(series3);

		times.clear();
		tMax.clear();
		tAvg.clear();
		tMin.clear();
		total = (long) 0;

		return dataset;
	}

	public static void Start() {
		int n = Gui.getSlider_2().getValue();

		// // 1th.
		// if (Gui.comboBox.getSelectedIndex() == 0) {
		// for (int i = 1; i < n; i++) {
		// c1(i);
		// }
		// }
		//
		// // 2th.
		// if (Gui.comboBox.getSelectedIndex() == 1) {
		// for (int i = 1; i < n; i++) {
		// c2(i);
		// }
		// }
		//
		// // 3th.
		// if (Gui.comboBox.getSelectedIndex() == 2) {
		// for (int i = 1; i < n; i++) {
		// c3(i);
		// }
		// }
		//
		// // 4th.
		// if (Gui.comboBox.getSelectedIndex() == 3) {
		// for (int i = 1; i < n; i++) {
		// c4(i);
		// }
		// }

		LineChartDemo2 demo = new LineChartDemo2("Time complexity test.");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}