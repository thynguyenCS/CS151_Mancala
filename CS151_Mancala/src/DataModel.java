
public class DataModel {
	private Pit[] pits;
	private GameState lastState;
	private int numberOfStones;
	private int undoCounter;
	private char currentPlayer;
	
	public DataModel() {
		
		//Initialize pits and fill them with the chosen number of stones
		pits = new Pit[12];
		for(Pit p : pits) {
			p = new Pit(numberOfStones);
		}
		
		//Set number of undoes
		undoCounter = 3;
		
		//Set the initial player turn (always starts on player A)
		currentPlayer = 'A';
		
		//Initialize the last state as null for the first turn
		lastState = null;
		
		
	}
	
	
}
