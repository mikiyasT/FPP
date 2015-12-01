package w1l1;

public class myClass {
	int x;
	float y;
	
	public String toString(){
		return "can't";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Programming quiz";
		System.out.println(name.startsWith("Prog"));
		System.out.println(name.startsWith("quiz",12));
		
		int i = 1;
		i = i++ + i++ + i++;
		System.out.println(i);
		//System.out.println(i);
		float a = 2.34f;
		float b = 5.4f;
		
		System.out.println(b%a);
		
	}

}

