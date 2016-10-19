/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 * adding line to this file
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	
	public void run() {
		runToWall();		
		runToDoor();
		runToBeeper();
		pickBeeper();
		turnAround();
		runToWall();
		turnRight();
		runToWall();
	}
	
	private void runToBeeper() {
		while (noBeepersPresent()) {
			move();
		}
	}

	private void runToDoor() {
		while (leftIsBlocked()) {
			move();
		}
		turnLeft();
	}
	
	private void runToWall() {
		while (frontIsClear()) {
			move();
		}
		if (leftIsBlocked()) {
			turnRight();
		}
		if (rightIsBlocked()) {
			turnLeft();
		}
	}
	
	private void turnRight() {
		for (int i=0;i<3;i++) {
			turnLeft();
		}
	}
	
	private void turnAround() {
		for (int i=0;i<2;i++) {
			turnLeft();
		}
	}
	
}
