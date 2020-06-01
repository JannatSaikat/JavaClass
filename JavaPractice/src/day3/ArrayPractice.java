package day3;

import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {
	
	
		
		int[] j = {1, 2, 3, 4, 5, 8, 9};
		
		for(int m =0; m < j.length; m++) {
			System.out.println("index "+ m+ " of j is: " +j[m]);
		}
//		Enhanced or advanced for loop
		int sum = 0;
		
		for(int m : j) {
			sum += m ;
			// sum = sum +m; 
			
		
		}
		
		System.out.println("sum is : " + sum);
//		for(dataType name: ArrayName) {
//			print(dataType);
//		}
		
		
		
		int[] k = new int[5];
		k[0] = 1; 
		k[1] = 2;
		k[2] = 5; 
		k[3] = 6;
		k[4] = 5;
		
		System.out.println(k[0]);
		System.out.println(k[1]);
		System.out.println(k[2]);
		System.out.println(k[3]);
		System.out.println(k[4]);
	
		System.out.println(k.length + "is length");
		
		for(int i = 0; i < k.length ; i++) {
			
			System.out.println(k[i]);
		}
		
//		System.out.println(j);
//		System.out.println("print 3rd element" + j[2]);
//	
//		System.out.println(k.length);
//	
//		String[] employeeName = {"name1", "name2", "name3"};	
		
	
	
		//=----==============================
		
		ArrayList<String> names = new ArrayList<String>();
		//<Object> 
		
		System.out.println("Before adding" + names);
		
	
			names.add( "Name0"); 
	
			names.add( "Name1");
			names.add( "Name2");
			names.add( "Name3");
			names.add(0,"Name4");
			
	
			System.out.println(names.size());
//			names.remove(4);
//			System.out.println(names);
			
			
			 
			//names[2] //names.get(2)
////		System.out.println("After adding" + names.get(2));
//			System.out.println("print 3rd element" + names.get(2));
//			System.out.println(names.size());
			
			
		
		
		
		
		
		
		
		
		
		
		
	}
}
