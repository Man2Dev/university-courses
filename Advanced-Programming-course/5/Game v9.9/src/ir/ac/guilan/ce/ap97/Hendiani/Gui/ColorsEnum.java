package ir.ac.guilan.ce.ap97.Hendiani.Gui;

import java.awt.Color;

public enum ColorsEnum {
	c1(1), c2(2), c3(3), c4(4), c5(5), c6(6), c7(7), c8(8), c9(9), c10(10), c11(11), c12(12), c13(13), c14(14), 
	c15(15), c16(16), c17(17), c18(18), c19(19), c20(20), c21(21), c22(22), c23(23), c24(24), c25(15), c26(26),
	c27(27), c28(28), c29(29), c30(30), WHITE(31);

	private int value;

	private ColorsEnum(int i) {
		this.value = i;
	}

	public Color getColor() {
		switch (value) {
		case 1:
			return Color.decode("#D2B48C");
		case 2:
			return Color.decode("#000000");
		case 3:
			return Color.decode("#008000");
		case 4:
			return Color.decode("#FF0000");
		case 5:
			return Color.decode("#00FF00");
		case 6:
			return Color.decode("#0000FF");
		case 7:
			return Color.decode("#FFFF00");
		case 8:
			return Color.decode("#00FFFF");
		case 9:
			return Color.decode("#FF00FF");
		case 10:
			return Color.decode("#C0C0C0");
		case 11:
			return Color.decode("#808080");
		case 12:
			return Color.decode("#800000");
		case 13:
			return Color.decode("#808000");
		case 14:
			return Color.decode("#800080");
		case 15:
			return Color.decode("#008080");
		case 16:
			return Color.decode("#000080");
		case 17:
			return Color.decode("#2F4F4F");
		case 18:
			return Color.decode("#ADD8E6");
		case 19:
			return Color.decode("#FF00FF");
		case 20:
			return Color.decode("#8B4513");
		case 21:
			return Color.decode("#D2691E");
		case 22:
			return Color.decode("#BC8F8F");
		case 23:
			return Color.decode("#FF4500");
		case 24:
			return Color.decode("#90EE90");
		case 25:
			return Color.decode("#00FFFF");
		case 26:
			return Color.decode("#4682B4");
		case 27:
			return Color.decode("#8A2BE2");
		case 28:
			return Color.decode("#4B0082");
		case 29:
			return Color.decode("#DB7093");
		case 30:
			return Color.decode("#BC8F8F");
		case 31:
			return Color.WHITE;

		default:
			return Color.decode("#6A5ACD");
		}

	}
}
