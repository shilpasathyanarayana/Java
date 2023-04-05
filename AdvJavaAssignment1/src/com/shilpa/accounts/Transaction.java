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
public class Transaction {
	public void selection() {
		File out = new File("data/trans.txt");
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(out);
			for (int i = 100; i < 110; i++) {
				int randomOperationX = (int) (Math.random() * (2 - 1 + 1)) + 1;
				if (randomOperationX == 1) {
					int radomOperationZ = (int) (Math.random() * (2 - 1 + 1)) + 1;
					if (radomOperationZ == 1) {
						printWriter.print(i + " ");
						int transactionAmmount = (int) (Math.random() * (10000 - (-10000) + 1) - 10000);
						printWriter.println(transactionAmmount);
						printWriter.print(i + " ");
						transactionAmmount = (int) (Math.random() * (10000 - (-10000) + 1) - 10000);
						printWriter.println(transactionAmmount);
					} else {
						printWriter.print(i + " ");
						int transactionAmmount = (int) (Math.random() * (10000 - (-10000) + 1) - 10000);
						printWriter.println(transactionAmmount);
					}
				}
			}
			for (int i = 110; i < 120; i++) {
				int randomOperationY = (int) (Math.random() * (2 - 1 + 1)) + 1;
				if (randomOperationY == 1) {
					printWriter.print(i + " ");
					int transactionAmmount = (int) (Math.random() * (10000 - (-10000) + 1) - 10000);
					printWriter.println(transactionAmmount);
				}
			}
			printWriter.close();
		} catch (Exception e) {
		}
	}
}
