package com.bridgelabz.logicalprograms;

import java.util.Scanner;

//Read a single Digit Number and write in word
public class ReadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single digit number: ");
		int num = sc.nextInt();
		readSingleDigitNum(num);

	}

	public static String readSingleDigitNum(int n) {
		String str = "";
		String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		if (n < 10) {
			str = units[n];
			System.out.println(str);
		} else {
			System.out.println("It is not a single digit number");
		}
		return str;

	}

}
