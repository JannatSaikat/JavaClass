package day9;

public class SumNumbers {
	
	//overloading 
	//i. different number of parameter
	//2. different data type/sequence of parameters
	
	void sum(int i, int j) {
		System.out.println(i+j);
	}

	void sum(double i, int j) {
		System.out.println(i+j);
	}
	
	void sum(double i, int j, int k) {
		System.out.println(i+j+k);
	}
	
	void sum(int i, double j) {
		System.out.println(i+j);
	}
	
	void sum(double i, double j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		SumNumbers ref = new SumNumbers();
		ref.sum(3.5,6,3);
	}
	

	
	
}
