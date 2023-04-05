import java.util.Scanner;

public class DefAndIntitialization {

	public static void main(String[] args) {
		//2 different ways of creating variables.
		
		int totalPrice1 = 0;
		int totalPrice2 = 100;
		
		System.out.println();
		int price = 20;
		
		System.out.println("Enter the quantity");
		Scanner scanner = new Scanner(System.in);
		
		int qua = scanner.nextInt();
		
		totalPrice1 = qua * 20;
		totalPrice2 = qua * 20;
	}

}
