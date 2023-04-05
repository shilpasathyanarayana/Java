import java.util.Scanner;

/**
 * 
 */

/**
 * @author shilp
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number");

		number = scanner.nextInt();
		do {
			int reminder = number % 10;
			System.out.printf("%d", reminder);
			number = number / 10;

		} while (number > 0);
		scanner.close();
	}

}
