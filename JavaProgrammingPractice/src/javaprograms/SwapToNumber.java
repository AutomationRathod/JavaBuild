package javaprograms;

public class SwapToNumber {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		int temp;
		
	/*	temp = a;
		a = b;
		b =temp;
		
		System.out.println(a);
		System.out.println(b);
		*/
		//Without temp variable
	/*	System.out.println("****************");
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println(a);
		System.out.println(b);
		
		*/
		System.out.println("****************");
		
		a = a*b;//50
		b = a/b;//5
		a = a/b;//10
		System.out.println(a);
		System.out.println(b);

	}

}
