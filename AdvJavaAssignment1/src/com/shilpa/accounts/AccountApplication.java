/**
 * 
 */
package com.shilpa.accounts;

/**
 * @author shilp
 *
 */
public class AccountApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OldMast data = new OldMast();
		data.generateData();
		Transaction ammount=new Transaction();
		ammount.selection();
		
		
		FileMatch fm = new FileMatch();
		fm.readMastFile("data/oldmast.txt");
		fm.readTransFile("data/trans.txt");
		
		
		
		fm.run();
	}

}