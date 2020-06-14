package day10;

public class ArrayRecap {
	
	
	
	
	
	public static void main(String[] args) {
		int [] numbers = {1, 3, 5, 7, 9};
		
		
		//normal for loop
		for(int i = 0; i < numbers.length ; i++) { 
			System.out.println(numbers[i]);
		}
		
		//advanced/enhanced/for each 
		for(int a: numbers) {
			System.out.println(a);
		}
		
		String [] names = {"Kabir", "Shakil", "Lucky"};
		
		  //
        for( String b : names) { //
            System.out.println(b);
        }
		
		//this works for ArrayList
//		System.out.println(numbers);
	}
	
}
