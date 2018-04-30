/**
 * The Player class which holds all of the information pertaining to the player
 */
public class Player {
	
	/** The player's name. */
	private String name;
	
	/** The player's current position. */
	private String currentPosition;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the player's name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the player's current position.
	 *
	 * @return the current position
	 */
	public String getCurrentPosition() {
		return currentPosition;
	}
	
	/**
	 * Sets the player's current position.
	 *
	 * @param currentPosition the new current position
	 */
	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}
	

}
