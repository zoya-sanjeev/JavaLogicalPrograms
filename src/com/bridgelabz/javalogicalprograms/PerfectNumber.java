package com.bridgelabz.javalogicalprograms;

public class PerfectNumber {

	public static void main(String[] args) {
		int numberTocheck=28;
		int sumOfDivisors=0;
		int index=1;
		while(index<=numberTocheck/2) {
			
			if(numberTocheck%index==0) {
				sumOfDivisors+=index;
			}
			index++;
		}
		if(numberTocheck==sumOfDivisors)
			System.out.println(numberTocheck+" is a perfect number");
		else
			System.out.println(numberTocheck+" is not a perfect number");

	}

}
