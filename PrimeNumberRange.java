package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class PrimeNumberRange {
	public static void primeNumberRange(int start, int end) {
		int count;
		//loop for finding and printing all prime numbers between given range
		for(int i = start ; i <= end ; i++)
		{
			//logic for checking number is prime or not
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
		
	
}
	public static void main(String[] args)
	{
		//scanner class object creation
		Scanner sc=new Scanner(System.in);
		//input from user
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		primeNumberRange(start, end);
		sc.close();
	}

}
