import java.awt.Color;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Layout2 implements BoardLayout {

	//RETANGLE
	
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
        return Color.PINK;
    }

    /**
     * pit shape for the game
     */
    @Override
    public Shape getPitShape() {
        return new Ellipse2D.Double(0, 0, 15, 15);
    }

    /**
     * pit dimension for the game
     */
    @Override
    public Dimension getDimension() {
        return new Dimension(45, 45);
    }
    
}