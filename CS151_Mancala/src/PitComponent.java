/*
 * Mancala Project - Pit.java
 * @author: Alex Frank and Thy Nguyen
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PitComponent extends JPanel{
private Pit pit;
private final JPanel pitPanel;

public int WIDTH =400, HEIGHT = 500;

public PitComponent(int numOfStones) {
	pit = new Pit(numOfStones);
	pitPanel = new JPanel();
	//setPreferredSize(WIDTH, HEIGHT);
}
public Pit getPit() {
	return pit;
}
public JPanel getPitPanel() {
	return pitPanel;
}
public void setSize(int w, int h) {
	setPreferredSize(new Dimension(w , h));
}
@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;
	drawStones(g2);
	repaint();
}
public void drawStones(Graphics2D g2) {
	int adjustFactor = 25;
	int numStones = pit.getNumberOfStones();
	int dia = 50;
	int row =0;
	if(numStones <6)
	row = (numStones%2) ==0? numStones/2: numStones/2 +1;
	else
		row = numStones/2;
//	int col =0;
//	if(numStones<=2)
//	col = numStones;
//	else {
//		if((numStones)%2 ==0)
//			col = numStones/row;
//	}
	int col = (numStones<=2)? numStones : numStones/row;
		
int x = this.getWidth()/(numStones+1)-adjustFactor, y = this.getHeight()/(numStones+1)+ adjustFactor;
int firstX = x;
for(int i =0; i < row; i++) {
	for(int j =0; j < col; j++) {
		//System.out.println(1);
	Ellipse2D stone = new Ellipse2D.Double(x,y,dia, dia );
	g2.setColor(Color.RED);
	g2.fill(stone);	
	x +=this.getWidth()/(numStones+1)+ adjustFactor/2;
	}
	x = firstX;
	y += this.getHeight()/(numStones+1)+ adjustFactor/2;
}
}

//public static void main(String[] arg) {
//	JFrame frame = new JFrame();
//	frame.setLayout(new GridLayout(0,6));
//	
//	for(int i =0; i < 6; i++) {
//		JPanel p = new PitComponent(6);
//		p.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
//		frame.add(p);
//	}
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.setVisible(true);
	
}








