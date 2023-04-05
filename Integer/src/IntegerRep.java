import java.util.Scanner;

public class IntegerRep {

	public static void main(String[] args) {
		System.out.printf("The charactor %c has integer representation %d%n", 'A', ((int) 'A'));
		System.out.printf("The charactor %c has integer representation %d%n", 'a', ((int) 'a'));
		System.out.printf("The charactor %c has integer representation %d%n", '$', ((int) '$'));
		System.out.printf("The charactor %c has integer representation %d%n", '6', ((int) '6'));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string");
		String name = scanner.next();
		char[] sChar = new char[10];
		sChar = name.toCharArray();
		if (sChar.length > 1) {
			System.out.println("Please enter any string of one charector");
			name=scanner.next();
			sChar=name.toCharArray();
			System.out.printf("The charactor %c has integer representation %d%n", sChar[0], ((int) sChar[0]));
		} else
			System.out.printf("The charactor %c has integer representation %d%n", sChar[0], ((int) sChar[0]));
		
	}

}
