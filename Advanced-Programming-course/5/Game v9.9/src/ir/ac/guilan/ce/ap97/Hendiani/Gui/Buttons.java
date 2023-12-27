package ir.ac.guilan.ce.ap97.Hendiani.Gui;

import javax.swing.JButton;

public class Buttons extends JButton {

	private ColorsEnum color;

	private int id;
	private int row;
	private int column;

	public ColorsEnum getColor() {
		return color;
	}

	public void setColor(ColorsEnum color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buttons other = (Buttons) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
