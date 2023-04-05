
public class EmployeeWithCons {
	
	public EmployeeWithCons() {
		super();
	}
	public EmployeeWithCons(int employeeid, String name, int salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salary;
	}
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
		return "EmployeeWithCons [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
