import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter the number:");
	    number=scanner.nextInt();
	    if(number %2 ==0)
	    {
	        System.out.printf("The %d is even",number);
	    }
	    else    
	         System.out.printf("The %d is odd",number);
	}
	
	

}
