package day9;

public class PolymorphismPractice {
	
	
	
	void a(String s1) {
		System.out.println(s1);
	}

	void a(int i1) {
		System.out.println(i1);
	}
	
	void a(int i1, int i2) {
		System.out.println(i1 + i2);
	}
	
	void a(double i3) {
		System.out.println(i3);
	}
	
	void b(int d) {
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		PolymorphismPractice ref = new PolymorphismPractice();
		ref.b(8);
		ref.a(2.0);
	}
	
}
