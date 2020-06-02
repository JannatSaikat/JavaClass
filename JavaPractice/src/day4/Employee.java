package day4;

public class Employee {
	String name; 
	int id;
	double salary;
	
	void getData(String name, int id, double salary) {
		this.name = name; 
		this.id = id;
		this.salary = salary;	
	}
	
	void printData() { 
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	
	
	
	

}
