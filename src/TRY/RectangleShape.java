package TRY;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class RectangleShape extends CompositeShapes{

	ArrayList<Shapes> lines;
	
	public  RectangleShape() {
		lines = new ArrayList<Shapes>();
	}
	
	@Override
	public void draw(Graphics g) {
		for(int i=0;i<lines.size();i++){
			 lines.get(i).draw(g);
		}g.setColor(new Color(0, 106, 78));
		g.fillRect(100, 100, 251, 151);
		
	}

	@Override
	public void AddChild(Shapes sh) {
		lines.add(sh);
		
	}



}
