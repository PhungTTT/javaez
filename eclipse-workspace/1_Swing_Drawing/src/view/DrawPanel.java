package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	
	private Shape shape = new Shape(Color.red,"Square","OutLine",0,0);
	private boolean checkClick = false;
	
	public DrawPanel() {
		this.setBackground(Color.yellow);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	/**
	 * clear Panel
	 */
	public void clear() {
		repaint();
	}
	/**
	 * 
	 */
	public void red() {
		shape.setColor(Color.red);
	}
	public void blue() {
		shape.setColor(Color.blue);
	}
	
	public void square() {
		shape.setShape("Square");
	}
	
	public void oval() {
		shape.setShape("Oval");
	}
	
	public void fill() {
		shape.setType("Fill");
	}
	
	public void outLine() {
		shape.setType("Out Line");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
			shape.setX(e.getX());
			shape.setY(e.getY());
			
			Graphics g = getGraphics();
			g.setColor(shape.getColor());
			shape.shapeOrOutline(g);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// Re chuot
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		this.checkClick = !this.checkClick;
		shape.setX(e.getX());
		shape.setY(e.getY());
		
		Graphics g = getGraphics();
		g.setColor(shape.getColor());
		shape.shapeOrOutline(g);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
