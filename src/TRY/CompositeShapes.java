package TRY;
import java.awt.Graphics;
import java.awt.Shape;

public abstract class CompositeShapes extends Shapes{
	public abstract void draw(Graphics g);
	public abstract void AddChild(Shapes sh);
}
