import java.util.Scanner;

/**
 * 
 */

/**
 * @author shilp
 *
 */
public class CurrencyConverter {
	int amountInRupees;
	int amountInDoller;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the amount in rupees:");
		int amountInRupees = scanner.nextInt();
		int amountInDoller = amountInRupees * 60;
		System.out.println("Amount in doller is $" + amountInDoller);
	}

}
