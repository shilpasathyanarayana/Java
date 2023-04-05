/**
 * 
 */
package com.shilpa.six;

/**
 * @author shilp
 *
 */
public class Qube extends ThreeDimensionalShape {
	int side;

	public Qube(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {

		return side * side * 6;
	}

	@Override
	public double getVolume() {

		return side * side * side;
	}

}
