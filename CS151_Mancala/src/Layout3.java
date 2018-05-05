import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class Layout3 implements BoardLayout {

	// RoundRectangle

	/**
	 * The border color of the pit
	 */
	@Override
	public Color getBorderColor() {
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
	public Shape getPitShape(JPanel p) {
		return new RoundRectangle2D.Float(0,0, p.getWidth(), p.getHeight(),p.getWidth()/2, p.getHeight()/2);
	}
/**
 * the thickness of the border of the pit
 */
	@Override
	public int getStroke() {
		return 5;
	}
/**
 * the color of the stone
 */
	@Override
	public Color getStoneColor() {
		// TODO Auto-generated method stub
		return Color.BLUE;
	}

}
