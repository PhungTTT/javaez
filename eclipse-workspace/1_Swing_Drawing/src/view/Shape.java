package view;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	private Color color;
	private String shape;//Square/Oval/...
	private String type;//fill/out Line
	private int x,y;
	/**
	 * This is Constructor of Shape
	 * @param color
	 * @param shape
	 * @param type
	 * @param x
	 * @param y
	 */
	public Shape(Color color, String shape, String type, int x, int y) {
		super();
		this.color = color;
		this.shape = shape;
		this.type = type;
		x = x;
		y = y;
	}
	/**
	 * Getter and Setter
	 */
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Cac hinh ve
	 */
	public void shapeOrOutline(Graphics g) {
		switch(shape) {
			case "Square":
				switch(type) {
					case "Fill":
						g.fillRect(x, y, 20, 20);
						break;
					case "Out Line":
						g.drawRect(x, y, 20, 20);
						break;
				}
				break;
			case "Oval":
				switch(type) {
					case "Fill":
						g.fillOval(x, y, 20, 20);
						break;
					case "Out Line":
						g.drawOval(x, y, 20, 20);
						break;
				}
				break;
		}
	}
}
