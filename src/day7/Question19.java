package day7;

import java.util.Scanner;

public class Question19 extends Question18
{
/* 19. Write a Program to accept three sides of triangle and display which kind of triangle is
formed.*/
	
	public static void main(String[] args) {
		System.out.println("Enter three sides of triangle separated with spaces");
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt(), b=scan.nextInt(), c=scan.nextInt();
		int greatest= Question18.largest(a, b, c), second = 0, third = 0;
		if(greatest==a) 
		{
			second = b;
			third = c;
		}
		else if(greatest==b)
		{
			second = a;
			third = c;
		}
		else
		{
			second = a;
			third = b;
		}
		if(a==b && a==c && b==a)
		{
			System.out.println("You can form an equilateral triangle");
		}
		else if(a==b || a==c || b==c)
		{
			System.out.println("You can form an isoceles triangle");
		}
		else if( (Math.pow(greatest,2)) == (Math.pow(second,2))+ (Math.pow(third, 2)))
		{
			System.out.println("You can form right angle triangle");
		}
		else
		{
			System.out.println("You can form a scalene triangle");
		}
			scan.close();
	}
}
