package day5;

import java.util.Scanner;

public class VowelOrConsonent {
		public static void main(String[] args) {
			int i=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter an Alphabet :");
			char ch=sc.next().charAt(0);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				System.out.println(ch + " is a Vowel");

	}else {
		System.out.println(ch + " is a consonent");
	}
	}
	}


