/*
 * Mancala Project - Pit.java
 * @author: Alex Frank and Thy Nguyen
 */

import java.util.Stack;

/**
 * The Class Pit.
 */
public class Pit{
	
	private int w, h;

	/** The stack, holding the number of stone in the pit */
	private Stack<Stone> stack;
	
	/**
	 * Instantiates a new pit.
	 */
	public Pit() {
		stack = new Stack<>();
	}
	
	/**
	 * Adds the stones.
	 *
	 * @param num the number of  stones will be added into the  pit
	 */
	public void addStones(int num) {
		for(int i= 0; i < num; i++) {
			stack.push(new Stone());
		}
	}
	
	/**
	 * @return the number of stones
	 */
	public int getNumOfStones() {
		return stack.size();
	}
	
	/**
	 * Removes the stone.
	 *
	 * @return the removed stone
	 */
	public Stone removeStone() {
		return stack.pop();
	}
	
	/**
	 * Removes all stones in the pit
	 *
	 * @return all the stones in the pit that will be moved to Mancala
	 */
	public Stack<Stone> removeAll() {
		if(stack.isEmpty())
			return null;
		else {
		Stack<Stone> moveToMancala = new Stack<>();
		while(!stack.isEmpty()) {
			moveToMancala.push(stack.pop());
		}
		return moveToMancala;
		}
	}
	
	/**
	 * Checks if is pit empty.
	 *
	 * @return true, if is pit empty
	 */
	public boolean isPitEmpty() {
		return stack.size() == 0;
	}

}

