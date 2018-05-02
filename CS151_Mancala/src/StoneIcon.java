/*
 * Mancala project - StoneIcon.java
 * @author: Thy Nguyen
 */

import java.awt.Color;

 import java.awt.Component;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.geom.Ellipse2D;

 import javax.swing.Icon;
 import javax.swing.JFrame;
 import javax.swing.JLabel;

public class StoneIcon implements Icon {
	private int a,b,dia;//diameter
	
	/**
	 * Construct a Stone object
	 * @param d: diameter of the stone object
	 */
	public StoneIcon(int d) {
		dia =d;		
	}
	
 	/**
 	 * Method to move the look of the stone 
 	 * @param dx distance moved on x-axis
 	 * @param dy distance moved on y-axis
 	 */
 	public void translate(int dx, int dy){
 		a +=dx;
 		b +=dy;
 	}
 	
 	@Override
 	public int getIconHeight() {
 		return dia;
 	}
 
 	@Override
 	public int getIconWidth() {
 		return dia;
 	}
 	@Override
 	public void paintIcon(Component c, Graphics g, int x, int y) {
 		a += (getIconWidth()-dia)/2;
 		b += (getIconHeight()-dia)/2;
 		Graphics2D g2 = (Graphics2D)g;
 		draw(g2);
 	}
 	
 	public void draw(Graphics2D g2){
 		Ellipse2D.Double stone = new Ellipse2D.Double(a,b,dia,dia);
 		g2.setColor(Color.BLACK);
 		g2.fill(stone);
 	}
		

 	//This is used to test the class
// 	public static void main(String[]a){
// 		JFrame frame = new JFrame();
// 		frame.setSize(300,300);
// 		Stone s = new Stone(30);
// 		JLabel label = new JLabel(s);
// 		frame.add(label);
// 		frame.pack();
// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		frame.setVisible(true);
// 		}
// 	
 
}
