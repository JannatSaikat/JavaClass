package day3;

import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {
		int i = 10;
		String s = "New York";
		
		int[] j = {1, 2, 3, 4, 5};
		
		int[] k = new int[5];
		k[0] = 1;
		k[1] = 2;
		k[2] = 5;
		k[3] = 6;
		k[4] = 5;
		
		System.out.println("print 3rd element" + j[2]);
	
		System.out.println(k.length);
	
		String[] employeeName = {"name1", "name2", "name3"};	
		
	
	
		//=----==============================
		
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println("Before adding" + names);
		
			names.add( "Name0");
			names.add( "Name1");
			names.add( "Name2");
			names.add( "Name3");
			names.add(1,"Name4");
			
			System.out.println(names);
			names.remove(4);
			System.out.println(names);
			
			
			 
			//names[2] //names.get(2)
//		System.out.println("After adding" + names.get(2));
			System.out.println("print 3rd element" + names.get(2));
			System.out.println(names.size());
			
			
		
		
		
		
		
		
		
		
		
		
		
	}
}
