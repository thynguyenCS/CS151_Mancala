
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Layout1 implements BoardLayout {

	//ELLIPSE
	
    /**
     * border color for the game
     */
    @Override
    public Color getBorderColor() {
        return Color.BLUE;
    }

    /**
     * pit color for the game
     */
    @Override
    public Color getPitColor() {
        return new Color(255,255,204);
    }

    /**
     * pit shape for the game
     */
    @Override
    public Shape getPitShape(JPanel p) {
        return new Ellipse2D.Double(0, 0, p.getWidth(), p.getHeight());
    }
    

    /**
     * The thickness of the border of the pit
     */

	@Override
	public int getStroke() {
		return 5;
	}
/**
 * The color of the stones
 */
	@Override
	public Color getStoneColor() {
		return Color.BLACK;
	}
    
}
