import java.util.Scanner;


public class ArithmeticOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name:");
		name = input.next();
		System.out.printf("Hello %s Please enter num1 ",name);
		num1 = input.nextInt();
		System.out.print("Enter num2:");
		num2 = input.nextInt();
		int sum= num1+ num2;
		System.out.printf("sum is %d%n" ,sum);
		int difference= num2 - num1;
		System.out.printf("difference is%d ", difference);
		
	
		
	}

}
