
public class GameState {
	private char currentPlayer;
	private int[] points;
	private boolean isModelNull = false;
	
	public GameState(DataModel model) {
		if(model == null) {
			isModelNull = true;
		}else {
			points = model.getPits();
			currentPlayer = model.getPlayerTurn();
		}
	}

	
}
