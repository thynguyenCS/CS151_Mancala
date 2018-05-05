
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * The Class GUI.
 */
public class GUI {

	/** The windowsize. */
	final Dimension WINDOWSIZE = new Dimension(2500,1000);
	
	/** The pits. */
	private PitComponent[] pits;
	
	/** The end turn button. */
	private JButton undoButton, setStyleButton, endTurnButton;


	/**
	 * Instantiates a new gui.
	 */
	public GUI() {
		//Build the window for the application
		JFrame gameWindow = new JFrame();
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.setTitle("Mancala");
		gameWindow.setSize(WINDOWSIZE);
		gameWindow.setResizable(false);
		gameWindow.setVisible(false);
		
		//Create undo and select style buttons
		undoButton = new JButton("Undo");
		setStyleButton = new JButton("Select Layout");
		endTurnButton = new JButton("End Turn");
				
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
		
		//set up layouts
		Layout1 l1 = new Layout1();
		Layout2 l2 = new Layout2();
		Layout3 l3 =  new Layout3();
		
		
		//Add pits to gameboard
		JPanel pitPanel = new JPanel();
		pitPanel.setLayout(new GridLayout(2,6));
		pits = new PitComponent[12];
		PitComponent temp;
		for(int i = 0; i < pits.length; i++) {
			temp = new PitComponent(3, l2);
			temp.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
			pits[i] = temp;
			temp.setSize(300, 400);
			pitPanel.add(pits[i]);
			}
		gameBoard.add(pitPanel, BorderLayout.CENTER);
		
		//Create Player B's Mancala
		JPanel mancalaEast = new JPanel();
		PitComponent mancalaB = new PitComponent(3, l2);	
		mancalaB.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
		mancalaEast.add(mancalaB);
		gameBoard.add(mancalaEast, BorderLayout.EAST);
		mancalaEast.setVisible(true);
		
		//Create Player A's Mancala
		JPanel mancalaWest = new JPanel();
		PitComponent mancalaA = new PitComponent(3, l2);
		mancalaA.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
		mancalaWest.add(mancalaA);
		gameBoard.add(mancalaWest, BorderLayout.WEST);
		mancalaWest.setVisible(false);

		gameBoard.setVisible(false);
		
		//start panel 
		StartPanel startPanel = new StartPanel();
		startPanel.setVisible(true);
		gameWindow.add(startPanel);
	
		
		
	}	
	
	/**
	 * Gets the pits.
	 *
	 * @return the pits
	 */
	public PitComponent[] getPits() {
		return pits;
	}

	/**
	 * Sets the pits.
	 *
	 * @param pits the new pits
	 */
	public void setPits(PitComponent[] pits) {
		this.pits = pits;
	}

	/**
	 * Gets the end turn button.
	 *
	 * @return the end turn button
	 */
	public JButton getEndTurnButton() {
		return endTurnButton;
	}

	/**
	 * Gets the sets the style button.
	 *
	 * @return the sets the style button
	 */
	public JButton getSetStyleButton() {
		return setStyleButton;
	}
	

}
	
	

