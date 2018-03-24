package TRY;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.w3c.dom.css.Rect;

public class Main {
	public static void main(String[] args) {
		JFrame frame;
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setTitle("  ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		JPanel panel = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Shapes l1 = new Line(100,100,350,100);
				Shapes l2 = new Line(100,100,100,250);
				Shapes l3 = new Line(100,250,350,250);
				Shapes l4 = new Line(350,250,350,100);

				CompositeShapes rect = new RectangleShape();
				CompositeShapes flag =  new Flag();
				
				Shapes circle = new Circle(175, 135, 80, 80);
				
				
				rect.AddChild(l1);
				rect.AddChild(l2);
				rect.AddChild(l3);
				rect.AddChild(l4);
				
				flag.AddChild(rect);
				flag.AddChild(circle);
				
				flag.draw(g);
				
				//circle = new Circle(160, 200, 10, 30);
				//circle.draw(g);
				//Shapes circle = new Circle(160, 135, 20, 80);

			}
		};
		frame.add(panel);
	}
}
