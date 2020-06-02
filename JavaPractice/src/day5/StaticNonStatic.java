package day5;

public class StaticNonStatic {
	
	
//	method  static
//	method  non static
//	variable static
//	variable non static
//	
//	
//	method  static { //use scenario //not creation
//		method  static
////		method  non static  -> object creation 
//		variable static
////		variable non static  -> object creation 
//		
//	}
//	
//	
//	method  non static {
//		method  static
//		method  non static
//		variable static
//		variable non static
//		
//	}
	
	
	static int a = 4;
	int b = 5;
	
	
	public static void main(String[] args) {
		
		StaticNonStatic ref = new StaticNonStatic();
		System.out.println(a);
		System.out.println(ref.b);

	}
	
	

	void method2() {
		System.out.println(a);	
	}
	
	
}
