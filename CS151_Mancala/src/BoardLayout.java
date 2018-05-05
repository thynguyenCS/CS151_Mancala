import java.awt.Color;
import java.awt.Shape;

import javax.swing.JPanel;
/**
 * The Interface BoardLayout.
 */
public interface BoardLayout {

    /**
     * board color for the game.
     *
     * @return the border color
     */
    Color getBorderColor();
    
    /**
     * pit color for the game.
     *
     * @return the pit color
     */
    Color getPitColor();
    
    /**
     * Gets the stone color.
     *
     * @return the stone color
     */
    Color getStoneColor();

    /**
     * pit shape for the game.
     *
     * @param p the p
     * @return the pit shape
     */
    Shape getPitShape(JPanel p);
    
    /**
     * get Stroke of the border.
     *
     * @return the stroke
     */
    int getStroke();
}
