package com.bridgelabz.javalogicalprograms;

import java.util.Scanner;

public class BinaryOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int decimalNumber=sc.nextInt();
		String binaryNumber=Integer.toBinaryString(decimalNumber);
		int lengthOfBinary=binaryNumber.length();
		String zeros="";
		while(lengthOfBinary<8) {
			zeros=zeros+"0";
			lengthOfBinary++;
		}
		binaryNumber=zeros.concat(binaryNumber);
		System.out.println("Binary Number:"+binaryNumber);
		String swapBinary=binaryNumber.substring(4)+binaryNumber.substring(0,4);
		System.out.println("After swapping nibbles:"+swapBinary);
		int power=0, number=0;
		for(int index = lengthOfBinary-1;index >= 0;index--){    
		     	int powerOfTwo=(int)Math.pow(2, power);
		     	number=number+powerOfTwo*(swapBinary.charAt(index)-'0');
		     	power++;
		     }
		System.out.println("Equivalent decimal value:"+number);
	}

}
