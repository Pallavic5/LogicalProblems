package com.bridgelabz.logicalprograms;

//Read a Number 1,10,100,1000 and display unit, ten hundred.

import java.util.Scanner;

public class ValueOfDigits {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int[] number = { 1, 10, 100, 1000 };
		if (n == number[0]) {
			System.out.println("It is a unit.");
		} else if (n == number[1]) {
			System.out.println("It is a ten.");

		} else if (n == number[2]) {
			System.out.println("It is a hundered");

		} else if (n == number[3]) {
			System.out.println("It is a thousand.");
		} else {
			System.out.println("Number is invalid.");
		}

	}

}
