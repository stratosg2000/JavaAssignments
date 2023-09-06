package com;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first;
		int second;
		int third;
		int largest;

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Let's find out the largest number between 3 integers");

			System.out.println("Pease enter the first integer number");
			first = sc.nextInt();

			System.out.println("Pease enter the second integer number");
			second = sc.nextInt();

			System.out.println("Pease enter the third integer number");
			third = sc.nextInt();

			if (first > second && first > third) {
				largest = first;
			}

			if (second > first && second > third) {
				largest = second;
			} else {
				largest = third;
			}

			System.out.println("The largest number is :" + largest);
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			

			
			System.out.println("An error has been occured ");
			e.printStackTrace();
			System.out.println("Please notice that program compares 3 integer numbers");
			
		}
	}

}
