package com.bridgelabz.javalogicalprograms;

public class ReverseANumber {

	public static void main(String[] args) {
		int numberToReverse=1899;
		int reversedNumber=0;
		int lastDigit=0;
		while(numberToReverse!=0) {
			lastDigit=numberToReverse%10;
			reversedNumber=reversedNumber*10 + lastDigit;
			numberToReverse=numberToReverse/10;
			
			}
		System.out.println("Reversed number is "+ reversedNumber);

	}

}
