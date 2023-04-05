/**
 * 
 */
package com.shilpa.accounts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shilp
 *
 */
public class FileMatch {
	private List<Account> accountsList;
	private List<TransactionRecord> transactionRecordsList;

	public FileMatch() {
		accountsList = new ArrayList<>();
		transactionRecordsList = new ArrayList<>();
	}

	public void run() {
		File out = new File("data/newMast.txt");
		PrintWriter printWriter = null;
		File outLog = new File("data/log.txt");
		PrintWriter printWriterLog = null;
		try {
			printWriterLog = new PrintWriter(outLog);
		} catch (Exception e) {
		}
		try {
			printWriter = new PrintWriter(out);
			for (int i = 0; i < transactionRecordsList.size(); i++) {
				boolean accountNumberFoundMaster = false;
				for (int j = 0; j < accountsList.size(); j++) {
					transactionRecordsList.get(i).getAccountNumber();
					if (accountsList.get(j).getAccountNumber() == transactionRecordsList.get(i).getAccountNumber()) {
						accountNumberFoundMaster = true;
						accountsList.get(j).combine(transactionRecordsList.get(i));
					}
				}
				if (!accountNumberFoundMaster) {

					printWriterLog.printf("Unmatched transaction record for account number %d%n",
							transactionRecordsList.get(i).getAccountNumber());

				}
			}
			for (int i = 0; i < accountsList.size(); i++) {
				printWriter.print(accountsList.get(i).getAccountNumber() + " ");
				printWriter.print(accountsList.get(i).getName() + " ");
				printWriter.println(accountsList.get(i).getBalance());
			}
			System.out.println("Program complete");
		} catch (

		FileNotFoundException e1) {
			e1.printStackTrace();
		}
		printWriter.close();
		printWriterLog.close();
	}

	public void readMastFile(String fileName) {
		File oldMastFile = new File(fileName);
		InputStream oldMastFileIS = null;
		try {
			oldMastFileIS = new FileInputStream(oldMastFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner oldMastScanner = new Scanner(oldMastFileIS);
		int i = 0;
		while (oldMastScanner.hasNext()) {
			int acountNumber = oldMastScanner.nextInt();
			String name = oldMastScanner.next();
			double balance = oldMastScanner.nextDouble();
			Account account = new Account(acountNumber, name, balance);
			this.accountsList.add(i, account);
			i++;
		}
		oldMastScanner.close();

	}

	public void readTransFile(String fileName) {
		File transFile = new File(fileName);
		InputStream transFileIS = null;
		try {
			transFileIS = new FileInputStream(transFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner transScanner = new Scanner(transFileIS);

		int i = 0;
		while (transScanner.hasNext()) {
			int acountNumber = transScanner.nextInt();
			double ammount = transScanner.nextDouble();
			TransactionRecord transactionRecord = new TransactionRecord(acountNumber, ammount);
			this.transactionRecordsList.add(i, transactionRecord);
			i++;
		}

		transScanner.close();
	}
}