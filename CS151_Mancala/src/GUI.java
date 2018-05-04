
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUI {

	public GUI() {
		//Build the window for the application
		JFrame gameWindow = new JFrame();
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.setTitle("Mancala");
		gameWindow.setSize(2500, 1000);
		gameWindow.setResizable(false);
		gameWindow.setVisible(true);
		
		//Create undo and select style buttons
		JButton undoButton = new JButton("Undo");
		JButton setStyleButton = new JButton("Select Layout");
		JButton endTurnButton = new JButton("End Turn");
				
		//Put buttons on a menu
		JPanel menu = new JPanel();
		menu.add(undoButton);
		menu.add(setStyleButton);
		menu.add(endTurnButton);
		menu.setVisible(true);
		
		//Make game board
		JPanel gameBoard = new JPanel();
		gameWindow.add(gameBoard);
		gameBoard.setLayout(new BorderLayout());
		gameBoard.add(menu, BorderLayout.NORTH);		
				
		//Add pits to gameboard
		JPanel pitPanel = new JPanel();
		pitPanel.setLayout(new GridLayout(2,6));
		PitComponent[] pits = new PitComponent[12];
		PitComponent temp;
		for(int i = 0; i < pits.length; i++) {
			temp = new PitComponent(3);
			temp.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
			pits[i] = temp;
			temp.setSize(300, 400);
			pitPanel.add(pits[i]);
			}
		gameBoard.add(pitPanel, BorderLayout.CENTER);
		
		//Create Player B's Mancala
		JPanel mancalaEast = new JPanel();
		PitComponent mancalaB = new PitComponent(3);	
		mancalaB.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
		mancalaEast.add(mancalaB);
		gameBoard.add(mancalaEast, BorderLayout.EAST);
		mancalaEast.setVisible(true);
		
		//Create Player A's Mancala
		JPanel mancalaWest = new JPanel();
		PitComponent mancalaA = new PitComponent(3);
		mancalaA.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
		mancalaWest.add(mancalaA);
		gameBoard.add(mancalaWest, BorderLayout.WEST);
		mancalaWest.setVisible(true);
		
		gameBoard.setVisible(true);
	}	
}
	
	

