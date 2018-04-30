/**
 * The Board class that keeps track of all pits and mancalas for both players.
 */
public class Board {
	
	/** The mancalas. */
	private MancalaHole[] mancalas = new MancalaHole[2];
	
	/** Player one's pits. */
	private Pit[] playerOnePits = new Pit[6];
	
	/**
	 * Gets the mancalas.
	 *
	 * @return the mancalas
	 */
	public MancalaHole[] getMancalas() {
		return mancalas;
	}
	
	/**
	 * Sets the mancalas.
	 *
	 * @param mancalas the new mancalas
	 */
	public void setMancalas(MancalaHole[] mancalas) {
		this.mancalas = mancalas;
	}
	
	/**
	 * Gets the player one pits.
	 *
	 * @return the player one pits
	 */
	public Pit[] getPlayerOnePits() {
		return playerOnePits;
	}
	
	/**
	 * Sets the player one pits.
	 *
	 * @param playerOnePits the new player one pits
	 */
	public void setPlayerOnePits(Pit[] playerOnePits) {
		this.playerOnePits = playerOnePits;
	}
	
	/**
	 * Gets the player two pits.
	 *
	 * @return the player two pits
	 */
	public Pit[] getPlayerTwoPits() {
		return playerTwoPits;
	}
	
	/**
	 * Sets the player two pits.
	 *
	 * @param playerTwoPits the new player two pits
	 */
	public void setPlayerTwoPits(Pit[] playerTwoPits) {
		this.playerTwoPits = playerTwoPits;
	}
	
	/** The player two pits. */
	private Pit[] playerTwoPits = new Pit[6];
	
	
	

}
