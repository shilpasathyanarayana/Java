/**
 * 
 */
package com.shilpa.field;

import com.shilpa.data.Vertex;
import com.shilpa.vehicles.Car;
import com.shilpa.vehicles.SportsCar;
import com.shilpa.vehicles.Tractor;
import com.shilpa.vehicles.Truck;
import com.shilpa.vehicles.Vehicle;

/**
 * @author shilp
 *
 */
public class Field {
	private Vertex[] quadrantVertices = new Vertex[4];
	private int quadrantLength;
	private Vehicle[] vehicles;
	private Vertex[] positionOfVehicles;

	private int totalVehicles;
	private int totalCars;
	private int totalTrucks;
	private int totalSportsCars;
	private int totalTractors;

	public Field() {

	}

	public Field(int quadrantLength, int totalVehicles, int totalCars, int totalTrucks, int totalsportsCars,
			int totalTractors) {
		this.quadrantLength = quadrantLength;
		this.totalVehicles = totalVehicles;
		this.totalCars = totalCars;
		this.totalTrucks = totalTrucks;
		this.totalSportsCars = totalsportsCars;
		this.totalTractors = totalTractors;
		quadrantVertices[0] = new Vertex(quadrantLength, quadrantLength);
		quadrantVertices[1] = new Vertex(-1 * quadrantLength, quadrantLength);
		quadrantVertices[2] = new Vertex(-1 * quadrantLength, -1 * quadrantLength);
		quadrantVertices[3] = new Vertex(quadrantLength, -1 * quadrantLength);
		vehicles = new Vehicle[totalVehicles];
		int i = 0;
		for (i = 0; i < totalCars; i++)
			vehicles[i] = new Car("Car", "" + i);
		for (i = i; i < totalCars + totalTrucks; i++)
			vehicles[i] = new Truck("Truck", "" + i);
		for (i = i; i < totalCars + totalTrucks + totalsportsCars; i++)
			vehicles[i] = new SportsCar("SportsCar", "" + i);
		for (i = i; i < totalCars + totalTrucks + totalsportsCars + totalTractors; i++)
			vehicles[i] = new Tractor("Tractor", "" + i);
		positionOfVehicles = new Vertex[totalVehicles];
		for (i = 0; i < totalVehicles; i++) {
			int x = (int) (Math.random() * (quadrantLength - (-1 * quadrantLength) + 1)) + (-1 * quadrantLength);
			int y = (int) (Math.random() * (quadrantLength - (-1 * quadrantLength) + 1)) + (-1 * quadrantLength);
			vehicles[i].setX(x);
			vehicles[i].setY(y);
			positionOfVehicles[i] = new Vertex(x, y);
		}
	}

	public Vertex[] getQuadrantVertices() {
		return quadrantVertices;
	}

	public void setQuadrantVertices(Vertex[] quadrantVertices) {
		this.quadrantVertices = quadrantVertices;
	}

	public int getQuadrantLength() {
		return quadrantLength;
	}

	public void setQuadrantLength(int quadrantLength) {
		this.quadrantLength = quadrantLength;
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public Vertex[] getPositionOfVehicles() {
		return positionOfVehicles;
	}

	public void setPositionOfVehicles(Vertex[] positionOfVehicles) {
		this.positionOfVehicles = positionOfVehicles;
	}

	public int getTotalVehicles() {
		return totalVehicles;
	}

	public void setTotalVehicles(int totalVehicles) {
		this.totalVehicles = totalVehicles;
	}

	public int getTotalCars() {
		return totalCars;
	}

	public void setTotalCars(int totalCars) {
		this.totalCars = totalCars;
	}

	public int getTotalTrucks() {
		return totalTrucks;
	}

	public void setTotalTrucks(int totalTrucks) {
		this.totalTrucks = totalTrucks;
	}

	public int getTotalSportsCars() {
		return totalSportsCars;
	}

	public void setTotalSportsCars(int totalSportsCars) {
		this.totalSportsCars = totalSportsCars;
	}

	public int getTotalTractors() {
		return totalTractors;
	}

	public void setTotalTractors(int totalTractors) {
		this.totalTractors = totalTractors;
	}

	public boolean areAllVehiclesDead() {
		boolean dead = false;
		for (int i = 0; i < vehicles.length; i++) {
			dead = !vehicles[i].isAlive();
			if (!dead)
				return false;
		}
		return dead;
	}

	public void kill() {
		for (int i = 0; i < vehicles.length; i++) {
			int x = vehicles[i].getX();
			int y = vehicles[i].getY();

			if ((x > 0 && x > quadrantLength || x < 0 && -1 * x > quadrantLength)
					|| (y > 0 && y > quadrantLength || y < 0 && -1 * y > quadrantLength)) {
				vehicles[i].setAlive(false);
			}
		}

	}

	@Override
	public String toString() {
		String status = "";
		for (int i = 0; i < vehicles.length; i++) {
			status = status + vehicles[i].getName() + " " + vehicles[i].getType();
			if (vehicles[i].isAlive()) {
				status = status + "(" + vehicles[i].getX() + "," + vehicles[i].getY() + "),";
			} else {
				status = status + "(Dead),";
			}
		}

		return status;
	}

}
