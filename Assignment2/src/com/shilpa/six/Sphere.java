package com.shilpa.six;

public class Sphere extends ThreeDimensionalShape {
	double radius;

	public Sphere(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 4 * 3.14 * radius * radius;
	}

	@Override
	public double getVolume() {
		return 4 / 3 * 3.14 * radius * radius * radius;
	}

}
