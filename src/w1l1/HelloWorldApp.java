package w1l1;
/** mikiyas teshome ist the author 
 
 * @author 984615
 *
 */

public class HelloWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello WOrld");
		System.out.println('\u0041');
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		
		if(str1.equals(str2))
			System.out.println("equal 1 ");
		if(str1 == str2)
			System.out.println("equal 2 ");
		if(str3 == str2)
			System.out.println("equal 3 ");
		if(str2.equals(str3))
			System.out.println("equal 4 ");
	}

}
