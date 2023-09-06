package com;

import java.util.Scanner;

public class GradeCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int subjectA;
		int subjectB;
		int subjectC;
		int total;
		double avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide the first subject detail");
		subjectA = sc.nextInt();

		System.out.println("Please provide the second subject detail");
		subjectB = sc.nextInt();

		System.out.println("Please provide the third subject detail");
		subjectC = sc.nextInt();

		total = subjectA + subjectB + subjectC;
		avg = total/3;

		System.out.println("The total sum is :" + total);
		System.out.println("The average is : " + avg);
		System.out.println("Based on the average your grade is :");

		if (avg > 90) {
			System.out.println("A+");
		}

		if ((avg > 75) && (avg < 90)) {
			System.out.println("A");
		}

		if ((avg > 60) && (avg < 75)) {
			System.out.println("B");
		}

		if (avg < 60) {
			System.out.println("C");
		}
	}
}
