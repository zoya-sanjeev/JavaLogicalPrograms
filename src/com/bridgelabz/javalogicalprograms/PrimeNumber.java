package com.bridgelabz.javalogicalprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int numberToCheck=19;
		int primeFlag=0;
		if(numberToCheck==0 || numberToCheck==1) {
			System.out.println(numberToCheck+" is not a prime number");
		}
		else
		{
			for(int index=2; index<=numberToCheck/2; index++) {
				if(numberToCheck%index==0) {
					primeFlag=1;
					break;
				}
				
			}
			if(primeFlag==0)
				System.out.println(numberToCheck+" is a prime number");
			else
				System.out.println(numberToCheck+" is not prime");
		}

	}

}
