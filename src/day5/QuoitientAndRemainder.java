package day5;

import java.util.Scanner;

public class QuoitientAndRemainder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a divident :: ");
		int divident=sc.nextInt();
		System.out.println("Enter second diviser :: ");
		int diviser = sc.nextInt();
		int quotient=divident/diviser;
		int remainder=divident%diviser;
		System.out.println("The quotient is =" + quotient);
		System.out.println("The remainder is =" + remainder);
	}
	}
