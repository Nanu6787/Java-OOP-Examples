package oopsPracticing;

abstract class Employee {
	
	private String name;
	private double salary;
	
	Employee (String name, double salary){
		this.name= name;
		this.salary= salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	abstract void work();
	
	public double yearlySalary() {
		return salary;
	}
	

}

class Developer extends Employee {
	
	public Developer (String name, double salary) {
		
		super (name, salary);
		
	}
	
	void work() {
		System.out.println("Writes java code");
	}
	
	public double yearlySalary() {
		return getSalary() * 12;
	}
	
	
	
	
}

class Tester extends Employee{
	
	public Tester(String name, double salary) {
		super (name, salary);
	}
	
	void work() {
		System.out.println("Tests Applications");
	}
	
	public double yearlySalary() {
		return getSalary()*12;
	}
}

public class Main {
	
	public static void main (String[] args) {
		
		Employee e1 = new Developer("Ranjan", 20000);
		Employee e2 = new Tester ("Prabhash", 15000);
		
		System.out.println("Developer Name :" + e1.getName());
		e1.work();
		
		System.out.println("Salary :" + e1.yearlySalary());
		
		System.out.println("-------------------------------------");
		
		System.out.println("Tester Name :" + e2.getName());
		e2.work();
		
		System.out.println("Salary :" + e2.yearlySalary());
	}
}

















