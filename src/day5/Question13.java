package day5;
//Write a program to print the number entered by user only if the number entered is negative.

import java.util.Scanner;

public class Question13
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter number");
		int entered_number= scan.nextInt();
		boolean check = (entered_number<0) ? true : false;
		if(check)
		{
			System.out.println(entered_number);
		}
		else
		{
			System.out.println("Not a negative number");
		}
		}
	}
}
