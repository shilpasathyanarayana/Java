
public class EmployeeNoCons {
	private int employeeid;
	private String name;
	private int salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeNoCons [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
