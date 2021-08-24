package com.bridgelabz.javalogicalprograms;

import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal(base 10) number");
		int decimalNumber=sc.nextInt();
		int binary[] = new int[40];    
	    int index = 0;    
	    while(decimalNumber > 0){    
	       binary[index++] = decimalNumber%2;    
	       decimalNumber = decimalNumber/2;    
	    }    
	    for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    

	}

}
