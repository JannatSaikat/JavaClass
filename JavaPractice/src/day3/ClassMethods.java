package day3;

public class ClassMethods {
	
	public int i = 9;
	int j = 10; 
	static int k = 15; 
	//static 
	

	public static void main(String[] args) {
		
//		System.out.println(j);
		System.out.println(k);
		
		// Private Protected Default Public
		// Protected Default

	}
	
	//non static
	protected void newMethod() {
		
		System.out.println(j);
		System.out.println(k);
			}

}
