package javaprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Plz enter a number:");
		
		int num = reader.nextInt();
		
		if(num%2==0)
			System.out.println("Even Number:" +num);
		else 
			System.out.println("Odd Number:" +num);

		
	}

}
