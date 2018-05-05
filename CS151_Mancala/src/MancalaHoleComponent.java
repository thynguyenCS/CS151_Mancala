import java.awt.Dimension;
import java.awt.Graphics;

public class MancalaHoleComponent extends PitComponent{
	private int WIDTH = 100, HEIGHT = 100;
public MancalaHoleComponent(int numStones, BoardLayout bl) {
	super(numStones, bl);
	setPreferredSize(new Dimension(WIDTH, HEIGHT));
	
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
}
}
