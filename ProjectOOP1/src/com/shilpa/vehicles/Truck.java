/**
 * 
 */
package com.shilpa.vehicles;

/**
 * @author shilp
 *
 */
public class Truck extends Vehicle {

	public Truck() {
		super();
	}

	public Truck(String name, String type) {
		super(name, type);
	}

	@Override
	public void move(int quantity) {
		if (alive) {
			int random = (int) (Math.random() * (2 - 1 + 1)) + 1;
			if (random == 1) {
				super.move(2);
			}
			if (random == 2) {
				random = (int) (Math.random() * (2 - 1 + 1)) + 1;
				if (random == 1) {
					x += 2;
					y += 2;
				}
				if (random == 2) {
					x -= 2;
					y -= 2;
				}
			}
		} else {
			throw new RuntimeException("Truck " + name + " is dead");
		}
	}
}