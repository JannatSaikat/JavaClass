package day7;

public class ArrayList2 {
	
	
	public static void main(String[] args) {
		
		int i =3;
		
		
		//way1
//		int[] j = {3,4,5};
		
		//way2
		int[] j1 = new int[3];
		j1[0]= 3;
		j1[1]= 4;
		j1[2]= 5;
		
//		System.out.println(j[0]);
//		System.out.println(j[1]);
//		System.out.println(j[2]);
		//way1
				int[] j = {3,4,5};
				
		//for loop
		for(int n = 0; n < j.length; n++) {
			System.out.println(j[n]);
		}
		
		
		System.out.println("==============");
		
		int sum = 0;
		
	
		//advanced for loop
		for(int m : j) {
			
			sum = sum + m;
			
			
		} 
		System.out.println(sum);
		
		System.out.println("length is" + j.length);
		
		
		
	}

}
