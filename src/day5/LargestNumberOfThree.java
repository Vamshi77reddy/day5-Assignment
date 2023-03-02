package day5;

import java.util.Scanner;

public class LargestNumberOfThree {

	public static void largest(int a, int b ,int c) {

		if (a>b && b>c ) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c )
		{
			System.out.println("B is greater");
			if (a == c &&  a!= b )
			{
				System.out.println(" and  A is eqal to C");
			}
		}else if (c>a && c> b) {
			System.out.println("C is greater");
			if (a == b &&  a!= c) {
				System.out.println("and A is eqal to B");
			}
		}
		
		
		
		else if (c == b && c!= a)
		{
			System.out.println(" C is eqal to b ");
		}
		else 
		{
			System.out.println("All values are same");
		}
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter a Number :: ");
		int a =scanner.nextInt();
		System.out.println("Enter b Number :: ");
		int b =scanner.nextInt();
		System.out.println("Enter c Number :: ");
		int c =scanner.nextInt();
		largest(a,b,c);
}}
