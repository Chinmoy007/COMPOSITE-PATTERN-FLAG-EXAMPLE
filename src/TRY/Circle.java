package TRY;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shapes {
	private int x;
	private int y;
	private int width;
	private int height;

	public Circle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}

	public void draw(Graphics g) {

		g.drawOval(x, y, width, height);
		g.setColor(new Color(244, 42, 65));
		g.fillOval(x, y, width, height);
	}

	
	public void AddChild(Shapes sh) {
		// TODO Auto-generated method stub
		
	}

}
