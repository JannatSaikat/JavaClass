package day4;

public class MethodsinJava {
	
	//public;  protected; default; private 
	//static; non-static
	//void ;  return type
	//param 
	
	int a = 10;
	static int b = 15;
	
	

	
	
	public static void main(String[] args) {
		
		
		//Class ref/name = new Constructor();
		
		
		MethodsinJava ref = new MethodsinJava();
		
		System.out.println(ref.a);
		System.out.println(b); 
		
		ref.new1(); 
		name();
		
	
		
	}
	
	 void new1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static String name() {
		String student = "Jon";
		return student;
	}
	
	int iD() {
		int student = 5;
		return student;
	}

	
}
