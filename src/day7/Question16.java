package day7;

import java.util.Scanner;

public class Question16
{
	/* 16. Write a program to find the given number is even or odd.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any positive number");
		int entered_number = scan.nextInt();
		if(entered_number%2 == 0)
		{
			System.out.println(entered_number + " is even");
		}
		else
		{
			System.out.println(entered_number + " is odd");
		}
		scan.close();
	}
	
	
}
