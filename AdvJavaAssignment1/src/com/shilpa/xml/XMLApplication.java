/**
 * 
 */
package com.shilpa.xml;

import com.shilpa.accounts.FileMatch;
import com.shilpa.accounts.OldMast;
import com.shilpa.accounts.Transaction;

/**
 * @author shilp
 *
 */
public class XMLApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OldMast data = new OldMast();
		data.generateData();
		Transaction ammount = new Transaction();
		ammount.selection();

		FileMatch fm = new FileMatch();
		fm.readMastFile("data/oldmast.txt");
		fm.readTransFile("data/trans.txt");

		fm.run();
	}

}
