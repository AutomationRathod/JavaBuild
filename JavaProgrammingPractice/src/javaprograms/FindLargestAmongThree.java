package javaprograms;

public class FindLargestAmongThree {

	public static void main(String[] args) {
		
		long x = 300;
		long y = 600;
		long z = 400;
		
		/*if(x > y && x > z)
		{
			System.out.println(x + "is largest");
		}
		else if(y > z)
		{
			System.out.println(y + "is largest");
		}
		else
		{
			System.out.println(z + "is largest");
		}
		*/
		if(x >= y)
		{
			if(y >= z)
			{
				System.out.println(x + " is X  largest");
			}else
			{
				System.out.println(z + " is Z largest");
			}
				
		}else
		{
			if(y >= z)
			{
				System.out.println(y + " is Y largest");
			}else
			{
				System.out.println(z + " is Z largest");
			}
		}
		
		
		
		

	}

}
