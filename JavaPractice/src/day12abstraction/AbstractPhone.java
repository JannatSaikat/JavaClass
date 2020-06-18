package day12abstraction;

public abstract class AbstractPhone implements Phone{

	public void call() {
		System.out.println("call");
	};
	
	public abstract void display();
	
	
	public void text(){
		System.out.println("text");
	};
	
	public void camera(){
		System.out.println("camera");
	};
}
