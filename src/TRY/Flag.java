package TRY;

import java.awt.Graphics;
import java.util.ArrayList;

public class Flag extends CompositeShapes {
	ArrayList<Shapes> shapes;

	public Flag() {

		shapes = new ArrayList<Shapes>();
	}

	public void draw(Graphics g) {
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw(g);
		}

	}

	@Override
	public void AddChild(Shapes sh) {
		shapes.add(sh);

	}

}
