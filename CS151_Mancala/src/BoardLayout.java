import java.awt.Color;
import java.awt.Shape;

import javax.swing.JPanel;

public interface BoardLayout {

    /**
     * board color for the game
     */
    Color getBorderColor();
    
    /**
     * pit color for the game
     */
    Color getPitColor();
    Color getStoneColor();

    /**
     * pit shape for the game
     */
    Shape getPitShape(JPanel p);
    /**
     * get Stroke of the border
     */
    int getStroke();

}
