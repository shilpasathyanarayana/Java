/**
 * 
 */

/**
 * @author shilp
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1. A constructor is a special method of a class
		 * 2. What is its specialty
		 * 		It has same name as its class
		 * 		Every class has a constructor even if not defined in java file
		 * 		Every time an object is created constructor is called either explicitly or implicitly.
		 * 		ClassName objectName =new ConstructorName()  // calling a constructor
		 * 3. What is default constructor
		 * 		When not specified java will create one for you (which is not visible but always available)
		 *             - default constructor (implicit)
		 *      Default constructor takes no parameters
		 * 4. What can constructor do
		 * 		It can be used to initialize instance variables and call its methods if required
		 * 5. How many constructors can a class have?
		 * 		as many as you want
		 * 6. How many can you call at once?
		 * 		you can call only one at a time
		 * 7. Other methods of class have a return type. does constructor have a return type
		 * 		consturctor has a return type that's always set to its own class type
		 * 8. A constructor always calls its class's parent class's constructor - by calling super() method
		 * 
		 * 		class B inherits class A
		 * 			class A is knows as parent, super
		 * 			class B is knows as child, subclass, inherting class
		 * 		All classes in java by default inherit Object class
		 * 			where is Object class defined - java class library
		 * 9. A class is not inheriting any other class. Does it iherit anything?
		 * 		Yes. A java class always inherits Object class
		 * 		every constructor can call constructor of Object class by calling super()
		 * 		If not called explicitly, it will be called by default
		 * 10. If yo write explicit constructor that takes parameters, then you must write default constructor.
		 * 11. Explicit constructor is not mandatory to write
		 */
		//Student s1 = new Student("Avinash",25,true,3.8);
		//System.out.println(s1);
		
		 EmployeeNoCons e2 = new EmployeeNoCons();
		    e2.setEmployeeid(100);
		    e2.setName("avinash");
		    e2.setSalary(1000000);
		    e2.getEmployeeid();
		    e2.getName();
		    e2.getSalary();
	   
		    EmployeeWithCons e1= new EmployeeWithCons(100,"avinash",100000);
			System.out.println(e1);
	}

}