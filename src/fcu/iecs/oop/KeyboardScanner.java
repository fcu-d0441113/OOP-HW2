package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		int num1;
		float num2;
		String name;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter a integer:");
		num1 = scanner.nextInt();
		System.out.printf("Enter a float point number:");
		num2 = scanner.nextFloat();
		System.out.printf("Enter a you name:");
		name = scanner.next();
		System.out.printf("Hi %s, the multiplication of %d and %f is %.2e.\n",name,num1,num2,num1*num2);
		scanner.close();
	}

}
