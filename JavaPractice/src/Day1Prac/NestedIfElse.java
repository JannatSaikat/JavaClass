package Day1Prac;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		int weekend = 6 ;
		
		if (weekend == 6) {
			
			System.out.println("It's sat day, weekend!");
			
		} else if (weekend == 7) {
			
			System.out.println("It's sun day, weekend!");
			
		} else if (weekend > 7) {
			
			System.out.println("It's wrong input");
			
		} else {
			
			System.out.println("It's weekday!");
		}
	}
	
	// You have int age = 70; 
	// less than 18 --> child
	// 18 - 60 --> young
	// 60+ --> old 
	// 90+  wrong input 
	
	
	
	

}
