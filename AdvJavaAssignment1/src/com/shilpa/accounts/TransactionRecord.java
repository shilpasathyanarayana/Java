 /**
 * 
 */
package com.shilpa.accounts;

/**
 * @author shilp
 *
 */
public class TransactionRecord {
	private int accountNumber;
	private double amount;

	public TransactionRecord(int accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
