package day3;

public class StringPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am in New York.";
		String a = "NEW";
		
		System.out.println(s.charAt(2));
		System.out.println(s.contains("Y"));
		
		System.out.println(s.concat(" New Jersy"));
		System.out.println(s.replace("New York", "New Jersy"));
		
		System.out.println(s + " New Jersy");
		
		
		System.out.println(a);
		System.out.println(a.toLowerCase());
	}

}
