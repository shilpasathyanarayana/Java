/**
 * 
 */
package com.shilpa.learning;

/**
 * @author shilp
 *
 */
public class MotorVehicles {
	 String ducati;
      String honda;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		ducati.start();
		ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		System.out.println("speed  of ducati is " +ducati.getSpeed());
		honda.setSpeed(50);
		System.out.println("Speed of honda is " +honda.getSpeed());
	}

}