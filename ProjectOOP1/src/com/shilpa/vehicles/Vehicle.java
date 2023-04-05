/**
 * 
 */
package com.shilpa.vehicles;

/**
 * @author shilp
 *
 */
public abstract class Vehicle {
	protected String name;
	protected String type;
	protected int x;
	protected int y;
	protected boolean alive;

	public Vehicle() {
		this.x = 0;
		this.y = 0;
		this.alive = true;
	}

	public Vehicle(String name, String type) {
		super();
		this.name = name;
		this.type = type;
		this.alive = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void move(int quantity) {
		if (alive) {
			int random = (int) (Math.random() * (4 - 1 + 1)) + 1;
			if (random == 1)
				x += quantity;
			if (random == 2)
				y += quantity;
			if (random == 3)
				x -= quantity;
			if (random == 4)
				y -= quantity;
		} else
			throw new RuntimeException("Vehicle is dead");
	}
}
