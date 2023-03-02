package day5;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int number=sc.nextInt();
		System.out.println("Enter the number:" +number);
		for (int i=1;i<=number;++i){
			if (number%i==0)
			{
				System.out.println(i + "");

			}

		}
	}
}
