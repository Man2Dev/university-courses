package ir.ac.guilan.ce.ap97.Hendiani.gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.io.File;
import java.util.Scanner;
import javax.swing.UIManager;

import ir.ac.guilan.ce.ap97.Hendiani.WordSearch;
import ir.ac.guilan.ce.ap97.Hendiani.gui.GuiButton1;
import ir.ac.guilan.ce.ap97.Hendiani.function.Function;

import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Window.Type;

public class outputText {

	private JFrame frmWordSearchV;

	/**
	 * Create the application.
	 */
	public outputText() {
		initialize();
	}

	public JFrame getFrmWordSearchV() {
		return frmWordSearchV;
	}

	public void setFrmWordSearchV(JFrame frmWordSearchV) {
		this.frmWordSearchV = frmWordSearchV;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmWordSearchV(new JFrame());
		getFrmWordSearchV().setForeground(UIManager.getColor("Button.shadow"));
		getFrmWordSearchV().setType(Type.UTILITY);
		getFrmWordSearchV().setTitle("Word search v0.7");
		getFrmWordSearchV().setBounds(100, 100, 752, 297);
		getFrmWordSearchV().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrmWordSearchV().getContentPane().setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		getFrmWordSearchV().getContentPane().add(scrollPane);

		JTextPane txtpnDacoicmA = new JTextPane();
		txtpnDacoicmA.setBackground(UIManager.getColor("Button.disabledForeground"));
		txtpnDacoicmA.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		txtpnDacoicmA.setEditable(false);
		txtpnDacoicmA.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				String ans = "";
				String readLine = null;
				Scanner scan = null;
				try {
					scan = new Scanner(new File("word.txt"));
					while (scan.hasNext()) {
						String temp = (scan.next());
						// just taking the last line.
						readLine = temp;
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String[] lineArr = readLine.split("");
				for (int i = 0; i < lineArr.length; i++) {

					ans += (lineArr[i] + "\t");
					if ((i + 1) % 10 == 0) {
						ans += System.getProperty("line.separator");
					}
				}
				txtpnDacoicmA.setText(ans);
				// closing scanner.
				scan.close();
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		txtpnDacoicmA.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 16));
		txtpnDacoicmA.setDropMode(DropMode.INSERT);
		scrollPane.setViewportView(txtpnDacoicmA);
	}

}
