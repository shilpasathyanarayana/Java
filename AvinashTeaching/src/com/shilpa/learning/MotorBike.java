package com.shilpa.learning;

public class MotorBike {
	private int speed;

	

	public MotorBike() {
		super();
	}

	public MotorBike(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void increaseSpeed(int howmuch) {
		this.speed= this.speed +howmuch;
		
	}
	public void start() {
		System.out.printf("%s Bike started", "ducati");
		System.out.println();
		System.out.printf("%s Bike started", "Honda");
		System.out.println();

	}
}
