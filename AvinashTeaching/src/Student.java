/**
 * 
 */

/**
 * @author shilp
 *
 */
public class Student {
	

	public Student() {
		
	}

	public Student(String name, int age, boolean isMinor, float gpa) {
	}

	private String name;
	private int age;
	private boolean isMinor;
	private float gpa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isMinor=" + isMinor + ", gpa=" + gpa + "]";
	}

}
