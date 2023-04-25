import java.util.Scanner;

public class DiamondShape {

	public static void main(String[] args) {
		int i = 0, j;
		System.out.println(" Enter the number of rows ");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int space = rows / 2 + 1;
		for (i = 0; i <= rows / 2 + 1; i++) {
			for (j = 0; j < space; j++)
				System.out.print(" ");
			for (int k = 0; k < 2 * i - 1; k++)
				System.out.print("*");
			space--;
			System.out.println();
		}
		space = 1;
		for (i = rows / 2; i > 0; i--) {
			for (j = space; j > 0; j--)
				System.out.print(" ");
			for (int k = 2 * i - 1; k > 0; k--)
				System.out.print("*");
			space++;
			System.out.println();
		}
	}

}
