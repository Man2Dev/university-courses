import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Queens0 {

	private static JFrame frame = new JFrame("-Queen");
	private static int count = 0;

	// checking if Queen can be placed.
	private static boolean canPlace(int[] x, int n) {
		for (int i = 0; i < n; i++) {
			if (x[i] == x[n] || (Math.abs(x[i] - x[n]) == Math.abs(n - i))
					|| (Math.abs(x[n] - x[i]) == Math.abs(n - i)))
				return false;
		}
		return true;
	}

	// getting maximum size width of screen.
	private int getMaxWidth() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		int width = (int) gd.getDefaultConfiguration().getBounds().getWidth();
		// int height = (int) gd.getDefaultConfiguration().getBounds().getHeight();
		return width;
	}

	// getting maximum size height of screen.
	private static int getMaxHeight() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		// int width = (int) gd.getDefaultConfiguration().getBounds().getWidth();
		int height = (int) gd.getDefaultConfiguration().getBounds().getHeight();
		return height;
	}

	// creating image.
	private static void createImage(JPanel panel, String name) throws IOException {
		new File("src/Output/" + name + "-Queen").mkdirs();
		BufferedImage bi = new BufferedImage(getMaxHeight(), getMaxHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = bi.createGraphics();
		panel.setSize(getMaxHeight(), getMaxHeight());
		layoutComponent(panel);
		panel.print(g);
		g.dispose();
		ImageIO.write(bi, "png", new File("src/Output/" + name + "-Queen/" + count + "th permutation.png"));
	}

	// Forcing all child components to appear.
	private static void layoutComponent(Component component) {
		synchronized (component.getTreeLock()) {
			component.doLayout();

			if (component instanceof Container) {
				for (Component child : ((Container) component).getComponents()) {
					layoutComponent(child);
				}
			}
		}
	}

	// creating gif.
	private static void animateImages(String name) throws IOException {
		AnimatedGifEncoder e = new AnimatedGifEncoder();
		e.start("src/Output/" + name + "-Queen/Answers.gif");
		// 1 frame per 30 sec.
		e.setDelay(500);
		// Infinite repeat.
		e.setRepeat(0);
		// adding it new image to gif.
		for (int i = 1; i <= count; i++) {
			Image image = ImageIO.read(new File("src/Output/" + name + "-Queen/" + i + "th permutation.png"));
			BufferedImage buffered = (BufferedImage) image;
			e.addFrame(buffered);
		}
		e.finish();
	}

	// checking is the file exists.
	private Boolean exists(File f) {
		if (f.exists() && !f.isDirectory()) {
			return true;
		}
		return false;
	}

	static void start(int[] q, int k, Boolean show) throws Exception {
		// n-Queen.
		int n = q.length;
		// resetting count for first run.
		if (k == 0)
			count = 0;

		if (k == n) {
			count++;
			String t = ("(" + (count) + "th permutation)");
			frame = new JFrame(n + "-Queen " + t);
			frame.setVisible(show);

			// Different types of frames.

			// TODO V1
			// frame.setSize(getMaxHeight()-80, getMaxHeight()-80);
			// frame.setPreferredSize(new Dimension(getMaxHeight()-80, getMaxHeight()-80));
			// frame.setMinimumSize(new Dimension(n * 40, n * 40));
			// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame.getContentPane().setSize(new Dimension(getMaxHeight()-140,
			// getMaxHeight()-140));
			// TODO V2
			frame.setSize(getMaxHeight(), getMaxHeight());
			frame.setPreferredSize(new Dimension(getMaxHeight(), getMaxHeight()));
			frame.setMinimumSize(new Dimension(n * 40, n * 40));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setSize(new Dimension(getMaxHeight(), getMaxHeight()));
			frame.setLocationRelativeTo(null);
			// TODO V3
			// frame.setSize(500, 500);
			// frame.setPreferredSize(new Dimension(500, 500));
			// frame.setMinimumSize(new Dimension(n * 40, n * 40));
			// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame.getContentPane().setSize(new Dimension(n * 110, n * 110));

			// setting the sub panel and label.
			JLabel temp = new JLabel();
			JPanel[][] squares = new JPanel[n][n];
			JPanel ans = new JPanel();
			ans.setSize(new Dimension((frame.getContentPane().getWidth()), (frame.getContentPane().getHeight())));
			ans.setLayout(new GridLayout(n, n));

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// Reseting the sub panel and label.
					squares[i][j] = new JPanel();
					squares[i][j].setSize((frame.getContentPane().getWidth() / n),
							(frame.getContentPane().getHeight() / n));
					temp = new JLabel();
					temp.setSize((frame.getContentPane().getWidth() / n), (frame.getContentPane().getHeight() / n));

					// setting black and while color to board.
					if ((i + j) % 2 == 0) {
						squares[i][j].setBackground(Color.WHITE);
						squares[i][j].setBorder(new LineBorder(Color.BLACK));
					} else {
						squares[i][j].setBackground(Color.BLACK);
						squares[i][j].setBorder(new LineBorder(Color.BLACK));
					}

					// setting the Queens.
					if (q[i] == j) {
						temp.setIcon(new ImageIcon(
								new javax.swing.ImageIcon(Queens0.class.getResource("/Resources/crown.png")).getImage()
										.getScaledInstance((frame.getContentPane().getWidth() / n)-10,
												(frame.getContentPane().getHeight() / n)-10, Image.SCALE_SMOOTH)));
						squares[i][j].add(temp);
						squares[i][j].revalidate();
						squares[i][j].repaint();
					}

					// setting everything to the final panel.
					ans.add(squares[i][j]);
					ans.revalidate();
					ans.repaint();

					// listen that shows the grid location.
					String g = i + "," + j;
					squares[i][j].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							System.out.println(g);
						}
					});
				}
			}
			// image of answer.
			createImage(ans, n + "");
			// adding the final panel to frame.
			frame.getContentPane().add(ans, BorderLayout.CENTER);
		} else {
			for (int i = 0; i < n; i++) {
				q[k] = i;
				if (canPlace(q, k)) {
					start(q, k + 1, show);
				}
			}
		}
	}

	public static void entery(int n, Boolean gui) {
		try {
//			Queens0 window = new Queens0();
//			 window.frame.setVisible(gui);
			start(new int[n], 0, gui);
			// adding all permutations to one gif.
			animateImages(n + "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Queens0 window = new Queens0();
//					// window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Queens0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize() {
		int n = 4;
		 for (int i =4; i < 6; i++) {
		entery(i, false);
		 }
	}

}
