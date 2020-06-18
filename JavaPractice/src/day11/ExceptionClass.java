package day11;

public class ExceptionClass {
	
	void c() throws Exception{
	
		System.out.println(5/0);
	
		System.out.println("Print");	
		
	}
	
	public static void main(String[] args) throws Exception {
		ExceptionClass ref = new ExceptionClass();
		ref.c();
		
		ClassPie pie = new ClassPie();
		System.out.println(pie.qty);
		
//		create object for HomeworkPractice;
		HomeworkPractice home = new HomeworkPractice();
		home.m1("max" , 90);
		
	}
	
}
