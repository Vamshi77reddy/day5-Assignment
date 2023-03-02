package day5;

import java.util.Scanner;

public class Distance2dArray {
	public static void main(String[] args) {



		Scanner getIpCoordinates = new Scanner(System.in);
		System.out.println(": Enter x-Co_Ordinate :");
		int pointX=getIpCoordinates.nextInt();
		System.out.println(": Enter y-Co_Ordinate :");
		int pointY=getIpCoordinates.nextInt();	
		System.out.println("::: CALCULATING DISTANCE FROM (x,y) TO (0,0) :::");
		double euclideanDistance=Math.sqrt((pointX*pointX)+(pointY*pointY));

		System.out.println(": Distance from (x,y) to (0,0)  ::"+euclideanDistance+" units");
	}
}
