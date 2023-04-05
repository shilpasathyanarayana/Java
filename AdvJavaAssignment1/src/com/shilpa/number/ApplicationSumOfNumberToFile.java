package com.shilpa.number;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author shilp
 *
 */
public class ApplicationSumOfNumberToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program start");
		File f1 = new File("C:\\Users\\shilp\\eclipse-workspace\\AdvJavaAssignment1\\src\\resources\\customers.txt"); // This
																														// is
																														// absolute
																														// path
		File in = new File("data/numbers.txt"); // This is relative path
		File out = new File("data/numbers-output.txt");
		Scanner scanner = null;
		InputStream inputStream = null;
		PrintWriter printWriter = null;
		try {
			inputStream = new FileInputStream(in);
			scanner = new Scanner(inputStream);
			printWriter = new PrintWriter(out);
			while (scanner.hasNext()) {
				int firstNumber = scanner.nextInt();
				printWriter.println("First number is :" + firstNumber);
				// System.out.println("Your first number in file is :" + firstName);
				int secondNumber = scanner.nextInt();
				printWriter.println("Second number is :" + secondNumber);
				// System.out.println("Your second name in file is :" + secondName);
				int sum = firstNumber + secondNumber;
				printWriter.println("The sum of two number is" + sum);
				int difference = firstNumber - secondNumber;
				printWriter.println("Difference of two numbers is" + difference);
				// System.out.println("Your age in file is :" + age);
				// System.out.println("---------------------------------------------");
			}
			System.out.println("Program complete");
			printWriter.close();
			inputStream.close();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

}
