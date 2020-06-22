package day14;

public class VariablePrac {
	
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		
		int temp = a;
		
		// a =2, b = 1, t = 2
		
		a = b;
		// a =1, b = 1, t = 2;
		
		b = temp;
		// a =1, b = 2, t / doens't matter
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);

	}
	
	

}
