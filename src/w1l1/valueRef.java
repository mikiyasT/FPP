package w1l1;

public class valueRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number n1 = new Number();
		
		
		Number n2 = n1;
		Number.change(n2);
		System.out.println(n1.x);
		System.out.println(n1.y);
		
		String name = new String("Robert");
		System.out.println(name == "Robert");
		System.out.println(name.equals("Robert"));
		
		
		System.out.println((double)1 / 9);
		System.out.println(1 / 2);
		
		char ch = (char)65.25; 
		System.out.println(ch);
		
		System.out.println(-17%-12); // -5 
		System.out.println(-17%12); // -5 
		
		System.out.println('\u0041');
		
		double x = 9.997; 
		int nx = (int) x;

		int len = "Hello".length();
		System.out.println("The length is : "+len);
		int zz = 4;
		 while(zz == 10){
			  System.out.println("Inside while loop");
			}
		 int cx[]= new int[10];
		 int lens = cx.length;
		 System.out.println(""+lens);





	}

}
class Number
{
	int x;
	int y;
	
	String name;
	
	Number(){
		x = 5;
		y = 6;
	}
	//by value
	public static void change(int a, int b){
		a = a+ 1;
		b = b+1;
	}
	
	//by ref
	public static void change(Number n){
			n.x += 2;
			n.y += 2;
		}
}
