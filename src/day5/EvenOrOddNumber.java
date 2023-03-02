package day5;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter an integer num :");
	int num = reader.nextInt();
	if(num%2==0) {
		System.out.println("This is even number :" +num);
	}else {
	
			System.out.println("This is odd number :" +num);
		}
		}
	}


