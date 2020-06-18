package day11;

public class ClassChild extends ClassParent{
	
	static int a = 20;
	
	ClassChild(){
		super();
		System.out.println("Constructor of child class");
		
	}
	static void b() {
		System.out.println("Method from child class");
	}
	
	static void c() {
		System.out.println("a from child: " + a);
		
	}
	
	
	public static void main(String[] args) {
	
		c();
	}
}
