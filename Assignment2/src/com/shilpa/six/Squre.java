/**
 * 
 */
package com.shilpa.six;

/**
 * @author shilp
 *
 */
public class Squre extends TwoDimensionalShape {
	int side;

	public Squre(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

}
