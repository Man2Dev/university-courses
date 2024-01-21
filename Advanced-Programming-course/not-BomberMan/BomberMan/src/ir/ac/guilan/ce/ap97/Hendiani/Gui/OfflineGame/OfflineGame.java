package ir.ac.guilan.ce.ap97.Hendiani.Gui.OfflineGame;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.lang.model.util.Types;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import ir.ac.guilan.ce.ap97.Hendiani.Function.Function;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.Login.Login;
import ir.ac.guilan.ce.ap97.Hendiani.Gui.StartGame.StartOffline;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class OfflineGame {
	public static ArrayList<String> temp = new ArrayList<String>();
	public static JFrame frmBomberman;
	public static JLabel lblStar1;
	public static JLabel lblStar2;
	public static JLabel lblStar3;
	public static JLabel lblLife;
	public static JLabel lblPic;
	public static JLabel lblTime;
	public static JPanel panel_2;
	public static JPanel panel_3;
	private Box horizontalBox;
	public static int enemyDead = 0;
	public static long timer = 1;
	public static float currentLife = 1;
	public static int maxNumbStarOnScrean = 0;
	public static int currentNumBomb = 0;
	public static int totalNumBomb = 0;
	public static int bombTimer = 0;
	private static int bombPosition;
	public static int bombradios = 2;
	public static boolean bombActive = false;
	public static boolean canExplode = false;
	public static boolean bombFound = false;
	public static boolean shouldCount20Sec = false;
	private static boolean gotHart = false;
	public static int sec20Count = 0;
	public static int whenShouldStartApear = Integer.parseInt((Function.ran(1, 9)) + "0");
	public static int starCount = 0;
	private static boolean gotSatar = false;
	public static int sec40Count = 0;
	private static boolean gotSatar2 = false;
	public static int sec40Count2 = 0;
	private static boolean gotSatar3 = false;
	public static int sec40Count3 = 0;
	private static ImageIcon gridPic;
	public static long numSatarAearing = 0;
	private static ArrayList<Icon> numberIconList = new ArrayList<>();
	private static ArrayList<Icon> lifeIcon = new ArrayList<>();
	public static boolean stop = false;
	public static JPanel gamePanel;
	private JPanel panel;
	private JPanel panel_1;
	public static JPanel theGame;

	/**
	 * Create the application.
	 */
	public OfflineGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBomberman = new JFrame();
		// frmBomberman.setVisible(true);
		// frmBomberman.pack();
		frmBomberman.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					Function.userMove(0);
					break;
				case KeyEvent.VK_DOWN:
					Function.userMove(1);
					break;
				case KeyEvent.VK_LEFT:
					Function.userMove(2);
					break;
				case KeyEvent.VK_RIGHT:
					Function.userMove(3);
					break;
				case KeyEvent.VK_SPACE:
					currentNumBomb++;
					if (Function.explosionIsRemoved && currentNumBomb > 1 || currentNumBomb == 1) {
						bombActive = true;
						currentNumBomb--;
						totalNumBomb++;
						Function.userMove(4);
					} else {
						currentNumBomb--;
					}
					break;
				}
			}
		});
		frmBomberman.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				OfflineGame.theGame.removeAll();
				OfflineGame.theGame.repaint();
				Function.setGui();
			}
		});
		frmBomberman.setIconImage(Toolkit.getDefaultToolkit().getImage(OfflineGame.class
				.getResource("/ir/ac/guilan/ce/ap97/Hendiani/image/5a357feb314172.5333863815134555952018.png")));
		frmBomberman.setForeground(Color.BLACK);
		frmBomberman.setFont(new Font("Algerian", Font.PLAIN, 15));
		frmBomberman.setTitle("BOMBERMAN");
		frmBomberman.setBounds(100, 100, StartOffline.theX, StartOffline.theY);
		frmBomberman.setLocationRelativeTo(null);
		frmBomberman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frmBomberman.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.NORTH);
		panel_5.setBackground(new Color(103, 128, 159));

		lblPic = new JLabel("");
		// setting the users image.
		File file = new File(Login.getPictures().get(Login.getPositionInList()));

		Image image = null;
		try {
			image = ImageIO.read(file);
		} catch (IOException e) {
		}
		lblPic.setIcon(new ImageIcon(image.getScaledInstance(93, 96, image.SCALE_DEFAULT)));
		// lblPic.setIcon(
		// new
		// ImageIcon(OfflineGame.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/Gui/Icon/Barkeep.png")));

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(103, 128, 159));
		panel_2.setLayout(new BorderLayout(0, 0));

		horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBackground(new Color(103, 128, 159));
		panel_2.add(horizontalBox, BorderLayout.EAST);

		lblTime = new JLabel("timer");
		lblTime.setBackground(new Color(103, 128, 159));
		lblTime.setFont(new Font("Algerian", Font.PLAIN, 53));
		lblTime.setForeground(Color.BLACK);
		lblTime.setHorizontalAlignment(SwingConstants.RIGHT);
		horizontalBox.add(lblTime);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(103, 128, 159));
		panel_1.setLayout(new BorderLayout(0, 0));

		lblLife = new JLabel("");
		panel_1.add(lblLife, BorderLayout.WEST);
		lblLife.setIcon(new ImageIcon(
				OfflineGame.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/image/hude/hud_heartEmpty.png")));

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(103, 128, 159));
		panel_1.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new BorderLayout(0, 0));

		lblStar1 = new JLabel("");
		lblStar1.hide();
		panel_3.add(lblStar1, BorderLayout.EAST);
		lblStar1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStar1.setIcon(
				new ImageIcon(OfflineGame.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/image/Items/star.png")));

		lblStar3 = new JLabel("");
		lblStar3.hide();
		lblStar3.setIcon(
				new ImageIcon(OfflineGame.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/image/Items/star.png")));
		lblStar3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblStar3, BorderLayout.WEST);

		lblStar2 = new JLabel("");
		lblStar2.hide();
		lblStar2.setIcon(
				new ImageIcon(OfflineGame.class.getResource("/ir/ac/guilan/ce/ap97/Hendiani/image/Items/star.png")));
		lblStar2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblStar2, BorderLayout.CENTER);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup().addComponent(lblPic)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE).addComponent(panel_2,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addComponent(lblPic)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE));
		panel_5.setLayout(gl_panel_5);

		theGame = new JPanel();
		frmBomberman.getContentPane().add(theGame, BorderLayout.CENTER);
		theGame.setBackground(new Color(49, 154, 7));
		theGame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
}
