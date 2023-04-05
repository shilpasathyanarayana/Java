import java.util.Scanner;

/**
 * 
 */

/**
 * @author shilp
 *
 */
public class NewReminder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int reverse = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number");
		number = scanner.nextInt();
		
		do {
			int reminder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + reminder;
		} while (number > 0);
		System.out.printf("Reversed number is %d\n", reverse);

	}

}
