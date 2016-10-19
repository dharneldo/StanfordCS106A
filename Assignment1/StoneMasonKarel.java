/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass extends SuperKarel
 * StoneMasonKarel is able to fix columns 4 space apart
 * StoneMasonKarel also has an ability to check last column
 * This solution is not very effective
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			fixColumn();
			turnAround();
			descend();
			runToNextColumn();
		}
		fixColumn();
		turnAround();
		descend();
	}

	private void runToNextColumn() {
		for (int i=0;i<4;i++) {
			move();
		}
	}
	
	private void fixColumn() {
		turnLeft();
		if (noBeepersPresent()) {
			putBeeper();
		}
		while (frontIsClear()) {
			if (noBeepersPresent()) {
			putBeeper();
			}
		move();
		}
	}
	
	private void descend() {
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
}