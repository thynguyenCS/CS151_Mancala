/**
 * The Pit class that keeps track of the stones in each pit.
 */
public class Pit {
	
	/** The number of stones. */
	private int numberOfStones;

	/**
	 * Gets the number of stones in the pit.
	 *
	 * @return the number of stones
	 */
	public int getNumberOfStones() {
		return numberOfStones;
	}

	/**
	 * Sets the number of stones in the pit.
	 *
	 * @param numberOfStones the new number of stones
	 */
	public void setNumberOfStones(int numberOfStones) {
		this.numberOfStones = numberOfStones;
	}
	
	/**
	 * Adds one stone to the pit.
	 */
	public void addStone() {
		numberOfStones++;
	}
	
	/**
	 * Removes one stone from the pit.
	 */
	public void removeStone() {
		numberOfStones--;
	}
}
