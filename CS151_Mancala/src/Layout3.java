import java.awt.Color;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Layout3 implements BoardLayout {

	// ELLIPSE

	/**
	 * board color for the game
	 */
	@Override
	public Color getBoardColor() {
		return Color.BLACK;
	}

	/**
	 * pit color for the game
	 */
	@Override
	public Color getPitColor() {
		return Color.ORANGE;
	}

	/**
	 * pit shape for the game
	 */
	@Override
	public Shape getPitShape() {

		return new Ellipse2D.Double(0, 0, 10, 10);

	}

	/**
	 * pit dimension for the game
	 */
	@Override
	public Dimension getDimension() {
		return new Dimension(45, 45);
	}

}