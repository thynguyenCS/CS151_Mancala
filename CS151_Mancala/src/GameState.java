
public class GameState {
	private boolean currentPlayer;
	private int[] stonesInPits;
	private boolean isStateNull = false;
	
	public GameState(DataModel model) {
		if(model == null) {
			isStateNull = true;
		}else {
			currentPlayer = model.getCurrentPlayer();
			stonesInPits = model.getPits();
		}
	}
	
	public boolean getIsStateNull() {
		return isStateNull;
	}
	
	public int[] getStonesInPits() {
		return stonesInPits;
	}
	
	public boolean getCurrentPlayer() {
		return currentPlayer;
	}
}
	

