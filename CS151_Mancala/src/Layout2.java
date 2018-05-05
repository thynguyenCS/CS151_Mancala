import java.awt.Color;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Layout2 implements BoardLayout {

	//RETANGLE
	
    /**
     * border color of the pit
     */
    @Override
    public Color getBorderColor() {
        return Color.YELLOW;
    }

    /**
     * pit color for the game
     */
    @Override
    public Color getPitColor() {
        return Color.PINK;
    }

    /**
     * pit shape for the game
     */
    @Override
    public Shape getPitShape(JPanel p) {
    	return new Rectangle2D.Double(0, 0, p.getWidth(), p.getHeight());    	
       
    }
/**
 * The thickness of the border of the pit
 */
	@Override
	public int getStroke() {
		return 4;
	}
/**
 * The color of the stone
 */
	@Override
	public Color getStoneColor() {
		return Color.BLACK;
	}
    
}
