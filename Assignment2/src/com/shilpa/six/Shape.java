package com.shilpa.six;

public class Shape {
	protected String name;

	public Shape() {
		super();
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 0;
	}

	public double getVolume() {
		return 0;
	}
}