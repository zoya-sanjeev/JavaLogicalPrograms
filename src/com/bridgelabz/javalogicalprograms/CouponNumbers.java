package com.bridgelabz.javalogicalprograms;
import java.util.*;
public class CouponNumbers {
	
	public static int getRandomCoupon(int numberOfCoupons) {
        return (int) (Math.random() * numberOfCoupons + 1);
    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Coupons");
		int numberOfCoupons=sc.nextInt();
		
		HashSet<Integer> generatedCoupons=new HashSet<>();
		int numberOfGenerations=0;
		while(generatedCoupons.size()!=numberOfCoupons) {
			int randomNumber=getRandomCoupon(numberOfCoupons);
			generatedCoupons.add(randomNumber);
			numberOfGenerations++;
		}
		System.out.println("Number of coupons generated are "+numberOfGenerations);
		
	}

}
