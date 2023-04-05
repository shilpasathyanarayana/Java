/**
 * 
 */
package com.shilpa.advjava;

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
public class ApplicationReadAndWriteToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program start");
		File f1 = new File("C:\\Users\\shilp\\eclipse-workspace\\AdvJavaAssignment1\\src\\resources\\customers.txt"); // This
																														// is
																														// absolute
																														// path
		File in = new File("data/customers.txt"); // This is relative path
		File out = new File("data/customers-output.txt");
		Scanner scanner = null;
		InputStream inputStream = null;
		PrintWriter printWriter = null;
		try {
			inputStream = new FileInputStream(in);
			scanner = new Scanner(inputStream);
			printWriter = new PrintWriter(out);
			while (scanner.hasNext()) {
				String firstName = scanner.next();
				printWriter.println("First name is :" + firstName);
				// System.out.println("Your first name in file is :" + firstName);
				String secondName = scanner.next();
				printWriter.println("Second name is :" + secondName);
				// System.out.println("Your second name in file is :" + secondName);
				int age = scanner.nextInt();
				printWriter.println("Age is is :" + age);
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
