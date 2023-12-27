package ir.ac.guilan.ce.ap97.Hendiani;

import ir.ac.guilan.ce.ap97.Hendiani.gui.GuiButton1;
import ir.ac.guilan.ce.ap97.Hendiani.gui.outputText;
import ir.ac.guilan.ce.ap97.Hendiani.gui.theGui;
import ir.ac.guilan.ce.ap97.Hendiani.function.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WordSearch {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					theGui window = new theGui();
					window.frmWordSearchV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
