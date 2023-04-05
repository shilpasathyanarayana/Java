package com.shilpa.six;

public class Triangle extends TwoDimensionalShape {
	double base;
	double height;

	public Triangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 1 / 2 * base * height;

	}

}
