package com.bridgelabz.logicalprograms;

import java.util.Scanner;

// Write a Program to reverse the integer number eg. Input n=231 reverse is 132

public class ReverseInteger {

	public static void main(String[] args) {
		int reversedNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();

		while (num != 0) {
			// last digit get from num.
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;

			// remove last digit from num
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversedNum);
	}

}
