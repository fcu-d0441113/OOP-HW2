package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		String str1,str2;
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.printf("Enter a string 1:");
			str1 = scanner.next();
			System.out.printf("Enter a string 2:");
			str2 = scanner.next();
			if(str1.equalsIgnoreCase(str2)){
				System.out.printf("The two strings are the same.");
				break;
			}
			else
				System.out.printf("The two strings are not the same.\n");
		}
		scanner.close();
	}

}
