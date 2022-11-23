package com.bridgelabz.logicalprograms;

import java.util.Scanner;

//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number:");
		int num = sc.nextInt();
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println("Sum of n Natural Numbers: " + sum);
	}

}
