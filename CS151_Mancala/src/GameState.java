
public class GameState {
	private char currentPlayer;
	private int[] stones;
	private boolean isModelNull = false;
	
	public GameState(DataModel model) {
		if(model == null) {
			isModelNull = true;
		}else {
			currentPlayer = model.getCurrentPlayer();
		}
	}

	
}
