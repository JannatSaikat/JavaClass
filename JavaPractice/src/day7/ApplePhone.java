package day7;

public class ApplePhone implements Regulation , Phone {
	
	public void safety() {
		
		System.out.println("Safety First by Apple");
	}

	public void call() {

		System.out.println("videoCall");
	}


	//@override
	public void display() {
		System.out.println("touch display");
	}

	
	public void text() {
		System.out.println("MMS, SMS");
	} 
	
	


}
