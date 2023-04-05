package com.shilpa.six;

public class Tetrahedron extends ThreeDimensionalShape {
	int side;

	public Tetrahedron(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		return 1 / 3 * Math.pow(3, 3 / 4) * Math.sqrt(side);
	}

	@Override
	public double getVolume() {
		return Math.pow(side, 3) / (6 * Math.sqrt(2));
	}

}
