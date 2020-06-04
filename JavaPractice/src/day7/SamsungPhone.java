package day7;

public class SamsungPhone implements Phone, Regulation{
	
	public void call() {
		System.out.println("Voice Call By Samsung");
	}
	
	public void display() {
		System.out.println("2.4 inch display By Samsung");	
	}
	
	public void text() {
		System.out.println("SMS By Samsung");
	}
	
	public void safety() {
		System.out.println("Safety ensured by Samsung");
	}
	
	public void camera() {
		System.out.println("New Camera by Samsung");
	} 
	
	public static void main(String[] args) {
		
		SamsungPhone sam = new SamsungPhone();
		sam.call();
		sam.display();
		sam.text();
		sam.safety();
		sam.camera();
		
	}

}
