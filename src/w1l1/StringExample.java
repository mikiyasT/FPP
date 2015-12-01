package w1l1;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String input : args)
			System.out.println(input);
		
		String name = "mikiyas teshome";
				String subName = name.substring(4);
				System.out.println(subName);
				
	String names[] = {"bob","marley","miko"};
	for(String aname : names)
		System.out.println(aname);
	
	//System.out.println(Arrays.toString(numbers));
	
	System.out.println('\u1200');

	}

}
