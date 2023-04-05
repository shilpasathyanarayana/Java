/**
 * 
 */
package com.shilpa.six;

/**
 * @author shilp
 *
 */
public class Circle extends TwoDimensionalShape {
	int radius;

	public Circle(String name,int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.1 * radius * radius;
	}

}
