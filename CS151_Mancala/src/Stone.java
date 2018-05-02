/*
 * Mancala project - Stone.java
 * @author: Thy Nguyen
 */

public class Stone {
	private boolean lastState; //will turn true when it is the last stone in moving pile of stone
	
	/**
	 * Constructor for stone object
	 * 
	 */
	public Stone() {
		lastState = false;	
	}
	
 	/**
 	 * To see if the stone is the last one in a pile
 	 * @return true if it is last, false otherwise
 	 */
	public boolean getLastState() {
		return lastState;
	}
	
	/**
	 * Set the state of the stone
	 */
	public void setLastState(boolean state) {
		lastState = state;
	}
	
}
