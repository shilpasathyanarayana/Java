/**
 * 
 */
package com.shilpa.accounts;

import java.io.File;
import java.io.PrintWriter;

/**
 * @author shilp
 *
 */
public class OldMast {
	public void generateData() {
		File out = new File("data/oldMast.txt");
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(out);
			for (int i = 100; i < 110; i++) {
				printWriter.print(i + " ");
				printWriter.print("customer" + i + " " );
				int balance = (int) (Math.random() * (10000 - (-10000) + 1) - 10000);
				printWriter.println(balance);
			}
			printWriter.close();
		} catch (Exception e) {

		}
	}
}
