

/**
 * The Class GameState.
 */
public class GameState {
	
	/** The current player. */
	private boolean currentPlayer;
	
	/** The stones in pits. */
	private int[] stonesInPits;
	
	/** The is state null. */
	private boolean isStateNull = false;
	
	/**
	 * Instantiates a new game state.
	 *
	 * @param model the model
	 */
	public GameState(DataModel model) {
		if(model == null) {
			isStateNull = true;
		}else {
			currentPlayer = model.getCurrentPlayer();
			stonesInPits = model.getPits();
		}
	}
	
	/**
	 * Gets the checks if is state null.
	 *
	 * @return the checks if is state null
	 */
	public boolean getIsStateNull() {
		return isStateNull;
	}
	
	/**
	 * Gets the stones in pits.
	 *
	 * @return the stones in pits
	 */
	public int[] getStonesInPits() {
		return stonesInPits;
	}
	
	/**
	 * Gets the current player.
	 *
	 * @return the current player
	 */
	public boolean getCurrentPlayer() {
		return currentPlayer;
	}
}
	

