package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter a integer:");
		num = scanner.nextInt();
		
		if(num%2==0)
			System.out.printf("The input integer is Even Number.");
		else
			System.out.printf("The input integer is Odd Number.");
		scanner.close();
	}

}
