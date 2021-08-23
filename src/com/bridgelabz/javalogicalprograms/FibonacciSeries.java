package com.bridgelabz.javalogicalprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fibonacciLimit=15;
		int previousNumber=0;
		int currentNumber=1;
		int nextNumber=previousNumber+currentNumber;
		System.out.print(previousNumber+" ");
		for(int index=1;index<fibonacciLimit;index++) {
			System.out.print(nextNumber+" ");
			nextNumber=previousNumber+currentNumber;
			previousNumber=currentNumber;
			currentNumber=nextNumber;
		}
	}

}
