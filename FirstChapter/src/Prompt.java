import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		Student student1=new Student("avi",10);
		Student student2=new Student("shilpa", 20);
		Student student3=new Student("aapy",30);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter name1:");
		student1.setName(scanner.next());
		System.out.println("Please enter num1 of name1:");
		student1.setNumber(scanner.nextInt());
		System.out.println(student1);
		System.out.print("Please enter name2:");
		student2.setName(scanner.next());
		System.out.println("Enter the num of name2:");
		student2.setNumber(scanner.nextInt());
		System.out.println(student2);
		System.out.print("Please enter name3:");
		student3.setName(scanner.next());
		System.out.println("Enter the num of name3:");
		student3.setNumber(scanner.nextInt());
		System.out.println(student3);
	}

}
class Student
{
	
	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	private String name;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Hey name " + name + ", your number is:" + number;
	}
	
}