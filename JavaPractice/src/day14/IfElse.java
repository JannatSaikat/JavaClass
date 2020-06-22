package day14;

public class IfElse {
	
	public static void main(String[] args) {
		int age = 62;
		
		if(age < 18) {
			System.out.println("Child");
		} else if (age >= 18 && age <= 62) {	
			System.out.println("Adult");	
		} else if (age > 62) {
			System.out.println("Senior");
		}
		
		
		int n = 3;
		
		if(n > 0) {
			System.out.println("Positive");
		} else if(n < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zerro");
		}
	}
	 


}
