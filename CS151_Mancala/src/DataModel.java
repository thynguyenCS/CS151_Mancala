import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.*;

public class DataModel {
	private Pit[] pits;
	private GameState lastState;
	private int numberOfStones;
	private int undoCounter;
	private boolean currentPlayer;
	private boolean changePlayer;
	private int playerAScore, playerBScore;
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
		currentPlayer = true;
		
		//Initialize the last state as null for the first turn
		lastState = null;	
		
	}
	
	public boolean getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(boolean currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public boolean getSwitch() {
		return changePlayer;
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
	
	public void setStartingStones(int numberOfStones) {
		int startingStones = numberOfStones;
		for(int i = 0; i < pits.length; i++) {
			pits[i].setNumberOfStones(startingStones);
		}
	}
	
	public int getNumberOfStonesInPit(int pitNumber) {
		return pits[pitNumber].getNumberOfStones();
	}

	public GameState getLastState() {
		return lastState;
	}
	
	public void replaceGameState(GameState gameState) {
		lastState = gameState;
	}

	public int getRemainingUndos() {
		return undoCounter;
	}
	
	public void changePlayer() {
		currentPlayer = !currentPlayer;
		undoCounter = 3;
		lastState = new GameState(null);
		changePlayer = false;
		notifyView();
	}
	
	public void reset(GameState s) {
		for(int i = 0; i < pits.length; i++) {
			pits[i].setNumberOfStones(s.getStonesInPits()[i]);
		}
		currentPlayer = s.getCurrentPlayer();
		changePlayer = false;
		notifyView();
	}
	
	public void undo() {
		if(undoCounter > 0) {
			reset(lastState);
			lastState = new GameState(null);
			undoCounter--;
		}
		notifyView();
	}
	
	public void clicked(int pit) {
		int stonesInPit = pits[pit].getNumberOfStones();
		pits[pit].setNumberOfStones(0);
		boolean next = true;
		boolean freeTurn = false;
		if(pit<6)
			next=false;
		while(stonesInPit > 0) {
			if(next) {
				pit++;
			}else {
				pit--;
			}
			if(pit == 12) {
				if(stonesInPit == 1) {
					freeTurn = true;
				}
				if(currentPlayer) {
					playerAScore++;
				}else {
					stonesInPit++;
				}
				pit = 6;
				next = false;
			}else if(pit == -1) {
				if(stonesInPit == 1) {
					freeTurn = true;
				}
				if(!currentPlayer) {
					playerBScore++;
				}else {
					stonesInPit++;
				}
				pit = 5;
				next=true;
			}else {
				pits[pit].setNumberOfStones(pits[pit].getNumberOfStones()+1);
			}
			stonesInPit--;
		}
	
		if((currentPlayer && !freeTurn) || (!currentPlayer && !freeTurn)) {
			changePlayer = true;
		}
		
		if(currentPlayer && pit < 12 && next && pits[pit].getNumberOfStones()==1) {
			playerAScore += pits[pit].getNumberOfStones();
			pits[pit].setNumberOfStones(0);
			playerAScore += pits[pit].getNumberOfStones();
			pits[pit-6].setNumberOfStones(0);
		}else if(!currentPlayer && pit > -1 && !next && pits[pit].getNumberOfStones() == 1) {
			playerBScore += pits[pit].getNumberOfStones();
			pits[pit].setNumberOfStones(0);
			playerBScore += pits[pit+6].getNumberOfStones();
			pits[pit+6].setNumberOfStones(0);
		}
		
		boolean gameEndA = true;
        boolean gameEndB = true;
       
        for(int i = 0; i < pits.length/2; i++)
            if(pits[i].getNumberOfStones() > 0)
                gameEndB = false;
        for(int j = pits.length/2; j < pits.length; j++)
            if(pits[j].getNumberOfStones() > 0)
                gameEndA = false;
        
        if(gameEndA || gameEndB) {
            for(int j = 0; j < pits.length/2; j++) {
                playerBScore += pits[j].getNumberOfStones();
                pits[j].setNumberOfStones(0);
            } for(int j = pits.length/2; j < pits.length; j++) {
                playerAScore += pits[j].getNumberOfStones();
                pits[j].setNumberOfStones(0);
            }
            notifyView();
            JOptionPane.showMessageDialog(null, "Game Over!");
            gameOver();
        }
        notifyView();
		
	
	}

	private void gameOver() {
		String winner;
		if(playerAScore > playerBScore) {
			winner = "Player A Wins";
		}else {
			winner = "Player B Wins";
		}
		JOptionPane.showMessageDialog(null, winner);
	}
	
	
	
	
	
	
}
