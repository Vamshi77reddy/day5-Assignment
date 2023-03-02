package day5;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {

		System.out.println("Enter a number :: ");
		Scanner scanner = new Scanner(System.in);

		int num=scanner.nextInt();
		if(num>0 && num<31)
		{
		for (int i = 1; i <= num; i++) 
		{
			System.out.println("2^" + i + " = " + (int) (Math.pow(2, i)));
		}

		}

	}
}
