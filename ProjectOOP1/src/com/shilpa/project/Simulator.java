package com.shilpa.project;

import java.util.ArrayList;
import java.util.List;

import com.shilpa.data.Vertex;
import com.shilpa.field.Field;
import com.shilpa.vehicles.Vehicle;

/**
 * 
 */

/**
 * @author shilp Thread.sleep(1000);
 */
public class Simulator {
	private long start;
	private long end;
	private Field field;
	private int numOfTurns = 0;
	List<List<Vertex>> history = new ArrayList<>();

	public Simulator(int quadrantLength, int totalVehicles, int totalCars, int totalTrucks, int totalsportsCars,
			int totalTractors) {
		field = new Field(quadrantLength, totalVehicles, totalCars, totalTrucks, totalsportsCars, totalTractors);
	}

	public void run() {
		start = System.currentTimeMillis();
		numOfTurns++;
		Vehicle[] currentVehicles = field.getVehicles();
		Vertex[] positionOfVehicles = field.getPositionOfVehicles();
		for (int i = 0; i < currentVehicles.length; i++) {
			Vertex currentLocationOfVehicle = new Vertex(currentVehicles[i].getX(), currentVehicles[i].getY());
			positionOfVehicles[i] = currentLocationOfVehicle;
			history.add(i, new ArrayList<>());
			List<Vertex> historyOfCurrentVehicle = history.get(i);
			historyOfCurrentVehicle.add(currentLocationOfVehicle);
		}
		System.out.printf("Turn %d:%s%n", 0, field);
		while (!field.areAllVehiclesDead()) {
			Vehicle[] vehicles = field.getVehicles();
			Vertex[] positionOfVehiclesToChange = field.getPositionOfVehicles();
			for (int i = 0; i < vehicles.length; i++) {

				try {
					Thread.sleep(1);
				} catch (Exception e) {
				}
				if (vehicles[i].isAlive()) {
					vehicles[i].move(1);
					Vertex newLocationOfVehicle = new Vertex(vehicles[i].getX(), vehicles[i].getY());
					positionOfVehiclesToChange[i] = newLocationOfVehicle;
					List<Vertex> historyOfCurrentVehicle = history.get(i);
					historyOfCurrentVehicle.add(newLocationOfVehicle);
				}
			}
			field.kill();
			System.out.printf("Turn %d:%s%n", numOfTurns, field);
			numOfTurns++;
		}
		end = System.currentTimeMillis();

		System.out.printf("Simulation terminated in %d turns in the field of %d*%d%n", numOfTurns,
				field.getQuadrantLength(), field.getQuadrantLength());
		System.out.printf("Simulation took total %d seconds until all vehicles are terminated.%n",
				(end - start) / 1000);

	}

}
