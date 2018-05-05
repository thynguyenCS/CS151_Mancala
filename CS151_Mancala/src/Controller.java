import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * The Class Controller.
 */
public class Controller implements ChangeListener{
	
	/** The model. */
	private DataModel model;
	
	/** The view. */
	private GUI view;

	/**
	 * Instantiates a new controller.
	 *
	 * @param g the g
	 * @param d the d
	 */
	public Controller(GUI g, DataModel d) {
		this.view = g;
		this.model = d;
		model.attatchToModel(this);
		stateChanged(null);
	}

	/**
	 * Update the state.
	 */
	public void stateChanged(ChangeEvent arg0) {
		// Update view
		Graphics g = null;
		for(int i = 0; i<view.getPits().length; i++) {			
			view.getPits()[i].paintComponent(g);
		}
		
	}
	
	/**
	 * Attach listeners.
	 */
	public void attach() {
		MouseListener l = new MouseListener() {

			public void mouseClicked(MouseEvent click) {
				model.replaceGameState(new GameState(model));
				model.notifyView();
				
			}

			public void mouseEntered(MouseEvent arg0) {
				//Do nothing
			}

			public void mouseExited(MouseEvent arg0) {
				//Do nothing
			}

			public void mousePressed(MouseEvent arg0) {
				//Do nothing
			}

			public void mouseReleased(MouseEvent arg0) {
				//Do nothing
			}
			
		};
		
		for(PitComponent pit : view.getPits()) {
			pit.addMouseListener(l); 
		}
		
		view.getEndTurnButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.changePlayer();
			}
		});
		
		view.getSetStyleButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
	}
}

