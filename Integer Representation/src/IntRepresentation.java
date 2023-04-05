import java.util.Scanner;

/*
 * Program to display integer representation of different alphabets, digits and special characters.
 * Also, prompt the user to enter any character of his/her desire and print its integer representation
 * 
 *  
 *  Prerequisites
 *  
 *  1. Different data types in java
 *  2. Understand different data types required for given assignment
 *  3. cast operator (int), (double) -- example
 *  4. Understand how to convert one data type to another using cast operator
 *  5. How to get integer representation of a character using cast operator -- (int) 'A'
 *  6. How to read input from user and assign to variables of different data types
 *  7. How to convert a string to its character array
 *  8. Display output on screen
 *  
 *  Convert a string to its character array
 *  
 *  character array = array converted from a string
 *  print a character using without typing it in the program.
 */

public class IntRepresentation {
	public static void main(String[] args) {
		System.out.println((char) 66);
		int age = 0;
		String name;
		float avgMarks;
		double degreeAvg;
		boolean graduated;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		age = scanner.nextInt();

		System.out.println("Enter the average mark");
		avgMarks = scanner.nextFloat();
		System.out.printf("Enter degree mark");
		degreeAvg = scanner.nextDouble();
		//System.out.printf("Is %s is graduated or not?", name);
		graduated = scanner.nextBoolean();

		System.out.println("Enter the name");
		name = scanner.next();
		char[] namesCharArray = name.toCharArray();
		System.out.println(namesCharArray[0]);
		System.out.println((int) namesCharArray[0]);
		// What is cast operator --- (datatype) --- this converts one data type to
		// another
		// when using cast operator with character the functionality of this operator is
		// bit different
	}

}