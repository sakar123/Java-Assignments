package day7;

import java.util.Scanner;

public class Question17 
{
/*17. Write a program to calculate leap year.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  the year");
		int entered_number = scan.nextInt();
		if(entered_number%4 == 0)
		{
			System.out.println(entered_number + " is a leap year");
		}
		else
		{
			System.out.println(entered_number + " is not a leap year");
		}
		scan.close();
	}
}
