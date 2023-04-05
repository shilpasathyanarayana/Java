package com.cdi.shilpa;
import java.util.Scanner;

public class SalesCommission {

	public static void main(String[] args) {
		String name;

		double[] priceList = new double[4];
		priceList[0] = 239.99;
		priceList[1] = 129.75;
		priceList[2] = 99.95;
		priceList[3] = 350.89;

		int itemnum;
		double totalprice = 0.0;
		System.out.println("Enter the name");
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();

		do {
			System.out.println(" enter the item number that you sold or enter -1 to stop");
			itemnum = scanner.nextInt();
			if (itemnum != -1) {
				System.out.printf(" then the quatity of the %d%n", itemnum);
				int quantity = scanner.nextInt();
				totalprice = totalprice + priceList[itemnum] * quantity;
			}
		} while (itemnum != -1);
		System.out.printf("Your total price is %f%n", totalprice);
		double commission = totalprice * 9 / 100 + 200;
		System.out.printf("Your commission is %f%n", commission);

	}

}
