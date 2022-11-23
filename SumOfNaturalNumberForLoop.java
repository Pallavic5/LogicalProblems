package com.bridgelabz.logicalprograms;

//Write a Program for the sum of n natural numbers.
import java.util.Scanner;

public class SumOfNaturalNumberForLoop {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number:");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("\nSum of n Natural Numbers: " + sum);
	}

}
