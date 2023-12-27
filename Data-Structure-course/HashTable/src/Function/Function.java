package Function;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Function {
	public static LinkedList<LinkedList<String>> outer = new LinkedList<LinkedList<String>>();
	public static LinkedList<String> inner = new LinkedList<String>();

	public static void insert(String[][] node) {
		int arrSize = node.length;
//		System.out.println(arrSize);
		setRoundColumn(node, " Index ", 0, false);
		outer.clear();
		inner.clear();
		// setting empty nodes.
		for (int i = 0; i < arrSize; i++) {
			inner = new LinkedList<String>();
			inner.add("Null");
			outer.add(inner);
		}
		// filling nodes with keys and definitions.
		for (int i = 0; i < arrSize; i++) {
			int g = Function.hashFunction(node[i][0], arrSize);
			String temp = (node[i][0] + "," + node[i][1]);

			if (!outer.get(g).isEmpty()) {
				// if the inner node is full.
				outer.get(g).add(temp);
			} else {
				// if the node is empty.
				inner = new LinkedList<String>();
				inner.add(temp);
				outer.add(inner);
			}
//			System.out.println(outer);
		}
		setRoundColumn2(outer, " Nodes ", 1, true);
		
		//showing time complexity.
		time(false);
	}


	public static void setRoundKeys(String Key, String Definition, int x, int y, int R, int G, int B, int r0, int g0,
			int b0, int r1, int g1, int b1) {
		JButton label = new JButton(Key) {
			@Override
			protected void paintComponent(Graphics g) {
				int r3 = R;
				int g3 = G;
				int b3 = B;
				int r4 = r0;
				int g4 = g0;
				int b4 = b0;
				int r5 = r1;
				int g5 = g1;
				int b5 = b1;
				int w = getWidth() - 1;
				int h = getHeight() - 1;
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				if (y == 0) {
					g2.setPaint(new Color(r3, g3, b3));
				} else if (y % 2 != 0) {
					g2.setPaint(new Color(r4, g4, b4));
				} else {
					g2.setPaint(new Color(r5, g5, b5));
				}
				g2.fillRoundRect(0, 0, w, h, h, h);
				g2.setPaint(Gui.Gui.panel.getBackground());
				g2.drawRoundRect(0, 0, w, h, h, h);
				g2.dispose();
				super.paintComponent(g);
			}

			@Override
			public void updateUI() {
				super.updateUI();
				setOpaque(false);
				setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
			}
		};
		// copying text when clicked.
		label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Copying.
				java.awt.datatransfer.StringSelection selection = new java.awt.datatransfer.StringSelection(
						label.getText().trim() + " = (" + label.getToolTipText() + ") in ("
								+ findIndex(label.getText().trim()) + ")");
				java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(selection, selection);
				// Pasting.
				Transferable t = clipboard.getContents(this);
				if (t == null)
					return;
				try {
					Gui.Gui.textField.setText((String) t.getTransferData(DataFlavor.stringFlavor));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		label.setOpaque(false);
		// label.setEnabled(false);
		label.setFocusPainted(false);
		label.setToolTipText(Definition);
		label.setBackground(new Color(r0, g0, b0));
		label.setForeground(new Color(228, 241, 254));
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Gui.Gui.panel.add(label, "cell " + x + " " + y);
	}

	public static void setRoundColumn(String[][] node, String header, int x, Boolean addArrow) {
		String temp1 = "";
		String temp2 = "";
		int indexSize = node.length;

		for (int i = 0; i <= indexSize; i++) {
			if (i == 0) {
				setRoundKeys(header, "Header", x, i, 207, 0, 15, 238, 90, 36, 150, 40, 27);
				// setColumn(0, " "+header+" ", 0, 207, 0, 15, 238, 90, 36, 191, 54, 12);
			} else {
				temp1 = "";
				temp2 = "";

				if (x == 0) {
					// header.
					// if entering index.
					int re = ((i - 1) + "").length();
					for (int j = 0; j <= ((header.length() - re) / 2); j++) {
						temp1 += " ";
					}
					temp1 += (i - 1);
					for (int j = temp1.length(); j <= (10 - re); j++) {
						temp2 += " ";
					}
					setRoundKeys((temp1 + temp2), "Index", x, i, 207, 0, 15, 148, 124, 176, 150, 54, 148);
				} else {
					// body.
					int re = node[i - 1][0].toString().length();
					for (int j = 0; j <= ((header.length() - re) / 2); j++) {
						temp1 += " ";
					}
					temp1 += node[i - 1][0].toString();
					for (int j = 0; j <= (header.length() - temp1.length()); j++) {
						temp2 += " ";
					}
					setRoundKeys((temp1 + temp2), node[i - 1][1].toString(), x, i, 207, 0, 15, 238, 90, 36, 150, 40,
							27);
					// System.out.println(node[i-1][1].toString());
				}

				// if pointer is needed.
				if (addArrow) {
					setRoundKeys((""), "Pointer", x, i, 207, 0, 15, 238, 90, 36, 150, 40, 27);
					setRoundKeys((">"), "Pointer", (x + 1), i, 207, 0, 15, 238, 90, 36, 150, 40, 27);
				}
			}
		}
	}

	public static void setRoundColumn2(LinkedList<LinkedList<String>> outer, String header, int x, Boolean addArrow) {
		for (int p = 0; p < outer.size(); p++) {
			if (p == 0) {
				// setting arrows.
				setArrows(x, p);
				// setting the header.
				setRoundKeys(header, "Header", x, p, 207, 0, 15, 238, 90, 36, 150, 40, 27);
				// setting arrows.
				// setArrows(x, p);
			}
			// setting the empty nodes.
			for (int t = 0; t < outer.get(p).size(); t++) {
				// getting the keys and definition.
				String[] Keys = outer.get(p).get(t).toString().split(",");
				// if a node is empty.
				if (outer.get(p).size() == 1) {
					// setting arrows.
					setArrows(x, (p + 1));
					// setting the empty Nodes.
					// pointing to null point at the end.
					nullIt(x, p);
				} else {
					// every other node.
					String temp1 = "";
					String temp2 = "";
					if (x == 0) {
						// setting index numbers.
						int re = ((t - 1) + "").length();
						for (int j = 0; j <= ((header.length() - re) / 2); j++) {
							temp1 += " ";
						}
						temp1 += (t - 1);
						for (int j = temp1.length(); j <= (10 - re); j++) {
							temp2 += " ";
						}
						setRoundKeys((temp1 + temp2), "Index", x, t, 207, 0, 15, 148, 124, 176, 150, 54, 148);
					} else {
						// entering nodes.
						if (!Keys[0].equals("Null")) {
							int re = Keys[0].length();
							for (int j = 0; j <= ((header.length() - re) / 2); j++) {
								temp1 += " ";
							}
							temp1 += Keys[0];
							for (int j = 0; j <= (header.length() - temp1.length()); j++) {
								temp2 += " ";
							}
							// setting the definition of word.
							setRoundKeys((temp1 + temp2), Keys[1], x, (p + 1), 207, 0, 15, 238, 90, 36, 150, 40, 27);
						}
					}
					// setting arrows.
					if (addArrow) {
						setArrows(x, (p + 1));
					}
				}
				if (outer.get(p).size() != 1) {
					if (!Keys[0].equals("Null")) {
						if (t == outer.get(p).size() - 1) {
							// pointing to null point at the end.
							nullIt(x, p);
						}
					}
				}
			}
		}
	}

	// Setting null point.
	public static void nullIt(int x, int y) {
		setRoundKeys("  Null  ", "Null", x, (y + 1), 207, 0, 15, 75, 75, 75, 75, 75, 75);
	}

	public static void setArrows(int x, int y) {
		setRoundKeys((""), "Pointer", x, y, 207, 0, 15, 238, 90, 36, 150, 40, 27);
		setRoundKeys((">"), "Pointer", x, y, 207, 0, 15, 238, 90, 36, 150, 40, 27);
	}

	public static int hashFunction(String word, int arraySize) {

		int hashKeyValue = 0;

		for (int i = 0; i < word.length(); i++) {

			// 'a' has the character code of 97 so subtract
			// to make our letters start at 1

			int charCode = word.charAt(i) - 96;

//			 int hKVTemp = hashKeyValue;

			// Calculate the hash key using the 26 letters
			// plus blank

			hashKeyValue = (hashKeyValue * 27 + charCode) % arraySize;

//			 System.out.println(word+ ") Hash Key Value " + hKVTemp
//			 + " * 27 + Character Code " + charCode + " % arraySize "
//			 + arraySize + " = " + hashKeyValue);

		}
//		 System.out.println(hashKeyValue);

		return hashKeyValue;

	}

	public static String findIndex(String Key) {
		try {
			int HashIndex = Function.hashFunction(Key, outer.size());

			for (int i = 0; i < outer.get(HashIndex).size(); i++) {
				String[] temp = outer.get(HashIndex).get(i).trim().split(",");
				if (temp[0].equals(Key.trim())) {
//					System.out.println(outer.get(i).get(HashIndex));
					return "X =" + (i-1) + ", Y =" + HashIndex;
				}
			}
		} catch (Exception e) {
		}
		return "?";
	}

	public static void removeIndex(String Key) {
		try {
			int x = 0;
			int y = 0;
			int HashIndex = Function.hashFunction(Key, outer.size());

			for (int i = 0; i < outer.get(HashIndex).size(); i++) {
				String[] temp = outer.get(HashIndex).get(i).trim().split(",");
				if (temp[0].equals(Key.trim())) {
					x = i;
					y = HashIndex;
				}
			}
			ArrayList<String> temp = new ArrayList<String>();
			for (int i = 0; i < outer.get(y).size(); i++) {
				temp.add(outer.get(y).get(i));
			}
			
			String[] tempp = temp.get(x).trim().split(",");
			if (tempp[0].equals(Key)) {
				temp.remove((x));
				outer.get(y).clear();
				
				for (int i = 0; i < temp.size(); i++) {
					outer.get(y).add(temp.get(i));
				}
				System.out.println(outer.get(y));
			}
		} catch (Exception e) {
		}
	}
	
	public static void insertIndex(String Key, String value) {
		int g = Function.hashFunction(Key, outer.size());
		String temp = (Key + "," + value);
		
		if (!outer.get(g).isEmpty()) {
			// if the inner node is full.
			outer.get(g).add(temp);
			System.out.println(outer.get(g).getLast());
		} else {
			// if the node is empty.
			inner = new LinkedList<String>();
			inner.add(temp);
			outer.add(inner);
			System.out.println(outer.get(g).getLast());
		}
		System.out.println(outer);
	}

	//time complexity.
	public static void time(Boolean show) {
		if (show) {
			// Insertion.
			long start = System.nanoTime();
			insertIndex("sda", "dsdsad");
			long end = System.nanoTime();
			System.out.println("Time Complexity for Insertion = "+(end - start));
			// Removal.
			start = System.nanoTime();
			removeIndex("add");
			end = System.nanoTime();
			System.out.println("Time Complexity for Removal = "+(end - start));
			// Search.
			start = System.nanoTime();
			findIndex("ask");
			end = System.nanoTime();
			System.out.println("Time Complexity for Search = "+(end - start));
			// Hashing.
			start = System.nanoTime();
			hashFunction("app", outer.size());
			end = System.nanoTime();
			System.out.println("Time Complexity for Hashing = "+(end - start));
		}
	}
}
