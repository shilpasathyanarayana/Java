import java.util.Scanner;

/*
 * Understanding variables and how to use them and print them
 */

public class Printingvalues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count1 = 0;
		while (count1 < 0) {
			System.out.println("Hello 1 "+count1++);
		}
		int count = 0;
		do {
			System.out.println("Hello " + count++);
		} while (count < 0);
	}
}
