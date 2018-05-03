
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
		
		//Put buttons on a menu
		JPanel menu = new JPanel();
		menu.add(undoButton);
		menu.add(setStyleButton);
		
		JPanel gameBoard = new JPanel();
		gameBoard.setLayout(new BorderLayout());
		gameBoard.add(menu, BorderLayout.NORTH);
		
		// Add initial screen with stone selection, layout options, start game button
		
		// Undo button 
		
		// 
	}
	
	
}
