import java.awt.Color;
import java.awt.Dimension;
import java.awt.Shape;

public interface BoardLayout {

    /**
     * board color for the game
     */
    Color getBoardColor();

    /**
     * pit dimension for the game
     */
    Dimension getDimension();
    
    /**
     * pit color for the game
     */
    Color getPitColor();

    /**
     * pit shape for the game
     */
    Shape getPitShape();

	static Object getStyle() {
		// TODO Auto-generated method stub
		return null;
	}

}