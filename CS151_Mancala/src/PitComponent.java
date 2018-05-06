
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 * The Class PitComponent.
 */
public class PitComponent extends JPanel {
	
	/** The pit. */
	protected Pit pit;
	
	/** The pit panel. */
	protected final JPanel pitPanel;
	
	/** The board layout. */
	BoardLayout  boardLayout;
	
	/** The pit shape. */
	Shape pitShape;

	/** The height. */
	private int WIDTH = 80, HEIGHT = 80;

	/**
	 * Instantiates a new pit component.
	 *
	 * @param numOfStones the num of stones
	 * @param bl the bl
	 */
	public PitComponent(int numOfStones, BoardLayout bl) {
		pit = new Pit(numOfStones);
		pitPanel = new JPanel();
		this.boardLayout = bl;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}

	/**
	 * Gets the pit.
	 *
	 * @return the pit
	 */
	public Pit getPit() {
		return pit;
	}

	/**
	 * Gets the pit panel.
	 *
	 * @return the pit panel
	 */
	public JPanel getPitPanel() {
		return pitPanel;
	}
	
	/**
	 * Paint the component
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(boardLayout.getPitColor());
		g2.setStroke(new BasicStroke(boardLayout.getStroke()));		
		pitShape = boardLayout.getPitShape(this);	
		g2.fill(pitShape);
		g2.setColor(boardLayout.getBorderColor());
		g2.draw(pitShape);
		drawStones(g2);		
		repaint();
	}

	/**
	 * Draw stones.
	 *
	 * @param g2 the g 2
	 */
	public void drawStones(Graphics2D g2) {
		int adjustFactor = 25;

		int numStones = pit.getNumberOfStones();
		int dia = this.getWidth() / 11;
		int row = 0;
		row = (numStones % 2) == 0 ? numStones / 2 : numStones / 2 + 1;
		if (row > 5)
			row = 4;
		int col = 0;
		if(numStones==0)
			col =1;
		else {
		if (numStones % row == 0)
			col = numStones / row;
		else
			col = numStones / row + 1;
		}

		int x = this.getWidth() / (numStones + 1) + adjustFactor;
		int y = this.getHeight() / (numStones + 1) + adjustFactor;
		int firstX = x;
		int stoneDrawn = numStones;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				Ellipse2D stone = new Ellipse2D.Double(x, y, dia, dia);
				g2.setColor(boardLayout.getStoneColor());
				g2.fill(stone);
				x += this.getWidth() / (numStones + 1) + adjustFactor /2;
				stoneDrawn--;
				if (stoneDrawn == 0)
					break;
			}
			x = firstX;
			if(numStones !=0)
			y += this.getHeight() / (numStones + 1) + adjustFactor/(numStones/row);
		}
	}
}
