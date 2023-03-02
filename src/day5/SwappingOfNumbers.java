package day5;

import java.util.Scanner;

public class SwappingOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x value :"   );

		int x=sc.nextInt();
		System.out.println("Enter the y value :"   );
		int y=sc.nextInt();

		System.out.println("Before swapping x:" +x  );
		System.out.println("Before swapping y:" +y  );
	int temp=x;
	x=y;
	y=temp;
	System.out.println("After swapping x:" +x  );
	System.out.println("After swapping y:" +y );

	}
}
