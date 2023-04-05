/**
 * 
 */
package com.shilpa.project;

import java.util.Scanner;

/**
 * @author shilp
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * int length; int totalVehicles; int totalCars; int totalTrucks; int
		 * totalSportsCars; int totalTractors; Scanner scanner = new Scanner(System.in);
		 * System.out.print("Enter the length of quadrant:"); length =
		 * scanner.nextInt(); while (length < 0) {
		 * System.out.print("Quadrant length must be positive.Please enter again:");
		 * length = scanner.nextInt(); }
		 * System.out.println("Entered quadrant length is:" + length);
		 * System.out.print("Enter the total number of vehicles:"); totalVehicles =
		 * scanner.nextInt(); while (totalVehicles < 0) {
		 * System.out.print("Number of vehicles must be positive.Please enter again:");
		 * totalVehicles = scanner.nextInt(); }
		 * System.out.println("Enter total number of cars:"); totalCars =
		 * scanner.nextInt(); while (totalCars < 0 || totalCars > totalVehicles) {
		 * System.out.print("Invalid number of cars,Please enter again:"); totalCars =
		 * scanner.nextInt(); } System.out.println("Enter total number of trucks:");
		 * totalTrucks = scanner.nextInt(); while (totalTrucks < 0 || totalTrucks >
		 * totalVehicles) {
		 * System.out.print("Invalid number of trucks,Please enter again:"); totalTrucks
		 * = scanner.nextInt(); }
		 * System.out.println("Enter total number of Sports Cars:"); totalSportsCars =
		 * scanner.nextInt(); while (totalSportsCars < 0 || totalSportsCars >
		 * totalVehicles) {
		 * System.out.print("Invalid number of Sports cars,Please enter again:");
		 * totalSportsCars = scanner.nextInt(); }
		 * System.out.println("Enter total number of tractors:"); totalTractors =
		 * scanner.nextInt(); while (totalTractors < 0 || totalTractors > totalVehicles)
		 * { System.out.print("Invalid number of tractors,Please enter again:");
		 * totalTractors = scanner.nextInt(); } // Simulator simulator = new
		 * Simulator(length, totalVehicles, totalCars, // totalTrucks, totalSportsCars,
		 * // totalTractors);
		 */
		Simulator simulator = new Simulator(10, 16, 4, 4, 4, 4);
		simulator.run();
		// scanner.close();
	}
}
