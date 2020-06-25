//Problem no. 3
package day4;
import java.util.Scanner;

public class Question3 
{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		System.out.println("The sum of two numbers is "+ (a+b));
		System.out.println("The sum of two numbers is "+ ((a+b)/2));
	}
}
