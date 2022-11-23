package com.bridgelabz.logicalprograms;

//Write a Program to find Palindrome Number.
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num, originalNum, reverseNum, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		num = sc.nextInt();
		originalNum = num;
		for (reverseNum = 0; num > 0; num /= 10) {
			rem = num % 10;
			reverseNum = (reverseNum * 10) + rem;
		}
		if (reverseNum == originalNum)
			System.out.println(originalNum + " is a palindrome number ");
		else
			System.out.println(originalNum + " is not a palindrome number ");
	}

}
