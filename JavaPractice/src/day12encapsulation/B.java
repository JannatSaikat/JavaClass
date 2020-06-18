package day12encapsulation;

public class B {
	
	public static void main(String[] args) {
		A a = new A();
		a.setName("Max");

    String person = a.getName();
 
    System.out.println(person); 
	}

}
