package TRY;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	JFrame frame;
	private int height;
	private int width;
	private String title;
	private Canvas canvas;

	public Display(int width, int height, String title) {
		this.height = height;
		this.width = width;
		this.title = title;
		canvas = new Canvas();
		creatDisplay();
	}

	public void creatDisplay() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));

		frame.add(canvas);

	}

	public Canvas getCanvas() {
		return canvas;

	}

	public JFrame getFrame() {
		return frame;

	}public Display getDisplay(){
		return this;
	}
}
