/**
 * 
 */
package com.shilpa.vehicles;

/**
 * @author shilp
 *
 */
public class SportsCar extends Vehicle {

	public SportsCar() {
		super();
	}

	public SportsCar(String name, String type) {
		super(name, type);
	}

	@Override
	public void move(int quantity) {
		if (alive) { // give one more chance to play

			int quantityX = (int) (Math.random() * (3 - 1 + 1)) + 1;
			int quantityY = 3 - quantityX;
			int randomOperationX = (int) (Math.random() * (2 - 1 + 1)) + 1;
			if (randomOperationX == 1) {
				x += quantityX;
			}
			if (randomOperationX == 2) {
				x -= quantityX;
			}
			int randomOperationY = (int) (Math.random() * (2 - 1 + 1)) + 1;
			if (randomOperationY == 1) {
				y += quantityY;
			}
			if (randomOperationY == 2) {
				y -= quantityY;
			}
		} else {
			throw new RuntimeException("Sports car " + name + " is dead");
		}
	}

}
