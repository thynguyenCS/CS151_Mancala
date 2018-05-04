import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.*;

public class DataModel {
	private Pit[] pits;
	private GameState lastState;
	private int numberOfStones;
	private int undoCounter;
	private char currentPlayer;
	private ArrayList<ChangeListener> cl;
	
	
	public DataModel() {
		
		//Initialize pits and fill them with the chosen number of stones
		pits = new Pit[12];
		for(Pit p : pits) {
			p = new Pit(numberOfStones);
		}
		
		//Initialize change listeners
		cl = new ArrayList<ChangeListener>();
		
		//Set number of undoes
		undoCounter = 3;
		
		//Set the initial player turn (always starts on player A)
		currentPlayer = 'A';
		
		//Initialize the last state as null for the first turn
		lastState = null;	
		
	}
	
	public char getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(char currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public void attatchToModel(ChangeListener c) {
		cl.add(c);	
	}
	
	public void notifyView() {
		for(ChangeListener c : cl) {
			c.stateChanged(new ChangeEvent(this));
		}
	}
	
	public int[] getPits() {
		int[] stonesInPit = new int[12];
		for(int i = 0; i< stonesInPit.length; i++) {
			stonesInPit[i] = pits[i].getNumberOfStones();
		}
		return stonesInPit;
	}
	
	public int getNumberOfStonesInPit(int pitNumber) {
		return pits[pitNumber].getNumberOfStones();
	}
	
	
	
}
