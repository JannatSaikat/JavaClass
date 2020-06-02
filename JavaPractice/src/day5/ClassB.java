package day5;

public class ClassB extends ClassA{

	int  i = 10;
	
	public static void main(String[] args) {
		
		ClassA  a = new ClassA();
		a.login();
		
		
		ClassB b = new ClassB();
		b.login();
	}
}
//child 