package day13;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		HashMap<Integer, String> userInfo = new HashMap<>();
		
		
		
		//ArrayList
		names.add("Andrew");
		names.add("Max");
		names.add("John");
		
		//HashMap
		userInfo.put(1, "Andrew");
		userInfo.put(2, "Max");
		userInfo.put(3,"John");
		
		//ArrayList
		System.out.println(names);
		//HashMap
		System.out.println(userInfo);
		
//		ArrayList
		names.remove("John");
		System.out.println(names);
		
//		HashMap
		userInfo.remove(3);
		System.out.println(userInfo);
		
		
		
	}

}
