package day9;

public class BeatsHP implements HeadPhones{

	@Override
	public void mic() {
		System.out.println("Dual mic, extra range");	
	}

	@Override
	public void volume() {
		System.out.println("Up and Down");	
	}

	@Override
	public void speaker() {
		System.out.println("extra bass, on/off");
			
	}
	
	public static void main(String[] args) {
		
		BeatsHP ref = new BeatsHP();
		ref.mic();
		ref.volume();
		ref.speaker();
		
	}

}
