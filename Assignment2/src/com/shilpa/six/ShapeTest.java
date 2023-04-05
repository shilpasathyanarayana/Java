/**
 * 
 */
package com.shilpa.six;

/**
 * @author shilp
 *
 */
public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle = new Circle("circle", 5);
		Shape square = new Squre("squre", 10);
		Shape cube = new Qube("cube", 20);
		Shape triangle = new Triangle("triangle", 2, 8);
		Shape sphere = new Sphere("sphere", 10);
		Shape tetrahedron = new Tetrahedron("tetrahedron", 5);

		Shape[] shapes = new Shape[] { circle, square, cube, triangle, sphere, tetrahedron };

		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] instanceof TwoDimensionalShape) {
				System.out.printf("Area of %s is %.2f%n", shapes[i].getName(), shapes[i].getArea());
			}
			if (shapes[i] instanceof ThreeDimensionalShape) {
				System.out.printf("Area of %s is %.2f%n", shapes[i].getName(), shapes[i].getArea());
				System.out.printf("Volume of %s is %.2f%n", shapes[i].getName(), shapes[i].getVolume());
			}
		}
	}
}
