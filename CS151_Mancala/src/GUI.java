
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public GUI() {
		//Build the window for the application
		JFrame gameWindow = new JFrame();
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.setTitle("Mancala");
		gameWindow.setSize(1000, 500);
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
		gameBoard.setVisible(true);
		
		
		
		
	}
	
	
}
