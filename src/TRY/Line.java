package TRY;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Line extends Shapes {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

	}

	public void draw(Graphics g) {

		g.drawLine(x1, y1, x2, y2);
	}

	
	public void AddChild(Shapes sh) {
		// TODO Auto-generated method stub
		
	}

}
