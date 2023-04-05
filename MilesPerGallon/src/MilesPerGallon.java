import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int milesDriven[] = new int[10];
		int gallonsUsed[] = new int[10];
		double milesPerGallon[] = new double[10];

		int totalmiles = 0;
		int totalGallonsUsed = 0;
		double totalMilesperGallon = 0.0;
		int numOfTrips = 0;

		do {
			System.out.println("Enter miles driven, Enter 0 to stop");
			milesDriven[numOfTrips] = scanner.nextInt();

			System.out.println("Enter gallons used and eneter 0 to stop");
			gallonsUsed[numOfTrips] = scanner.nextInt();
			milesPerGallon[numOfTrips] = milesDriven[numOfTrips] / gallonsUsed[numOfTrips];
			System.out.printf("Miles per gallon is %.2f\n", milesPerGallon[numOfTrips]);
			totalmiles = totalmiles + milesDriven[numOfTrips];
			totalGallonsUsed = totalGallonsUsed + gallonsUsed[numOfTrips];

		} while (milesDriven[numOfTrips++] != 0);
		System.out.println("Total miles drivan is " + totalmiles);
		System.out.println("Total gallons used is " + totalGallonsUsed);
		totalMilesperGallon = totalmiles / totalGallonsUsed;
		System.out.println("The average of miles per gallon is" + totalMilesperGallon);

	}

}
