package day5;

import java.util.Scanner;

public class HaemonicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number ");
		int number = scanner.nextInt();

		if (number != 0) 
		{
		for(int i=1; i<=number;i++) 
		{
			System.out.print(" + (1/"+i+")");
		}
		}


	}
}
