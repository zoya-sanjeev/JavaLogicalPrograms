package com.bridgelabz.javalogicalprograms;

import java.util.Scanner;

public class TemperatireConversion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Celsius to Farenheit \n2.Farenheit to Celsius \nEnter choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1: System.out.println("Enter temperture in Celsius");
				double celsiusTemperatue=sc.nextDouble();
				System.out.println(((celsiusTemperatue* 9/5)+32)+" degree farenheit");
				break;
		case 2: System.out.println("Enter temperture in Farenheit");
				double farenheitTemperature=sc.nextDouble();
				System.out.println(((farenheitTemperature- 32)*5/9)+" celsius");
		
		
		}

	}

}
