package day6;

public class ClassZ extends ClassY {
	int v3 = 10;
	
	
	void m3() {
		System.out.println("Method of ClassZ");	
		
	}
	
	public static void main(String[] args) {
		
		ClassZ z = new ClassZ();
		z.m1();
		z.m2();
		z.m3();
		System.out.println(z.v1);
		System.out.println(z.v2);
		System.out.println(z.v3);
		
	}

}
