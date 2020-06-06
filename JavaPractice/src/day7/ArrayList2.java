package day7;

import java.util.ArrayList;

public class ArrayList2 {
	
	
	public static void main(String[] args) {
		
		int i =3;
		
		
		//way1
		int[] j = {3,4,5};
		
		//way2
		int[] j1 = new int[3];
		j1[0]= 3;
		j1[1]= 4;
		j1[2]= 5;

				
		//for loop
		for(int n = 0; n < j.length; n++) {
			System.out.println(j[n]);
		}

		System.out.println("==============");

		//advanced for loop
		for(int m : j) {
			System.out.println(m);		
		} 
		
		System.out.println("length is" + j.length);
		
		int i1 = 6;
		
		String s = "Sth";
		
		ArrayList<Integer> j3 = new ArrayList<Integer>();
		
		j3.add(2); //1
		j3.add(3); //2
		j3.add(0, 4); //0
		j3.add( 5); //3
		j3.add(1, 6); //4
		
		
		System.out.println(j3.size());
		
		System.out.println(j3);
		
		j3.remove(2);
		
		System.out.println(j3);
		
		
		
		

	}

}
