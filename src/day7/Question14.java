package day7;

import java.util.Scanner;

public class Question14 
{
/*14. Write a program to relate two integers entered by user using = =or &gt; or &lt; sign.*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integer separated with spaces");
		int a= scan.nextInt(), b=scan.nextInt()	;
		if(a==b)
		{
			System.out.println("Two numbers are equal");
		}
		else if(a>b)
		{
			System.out.println("The number that was entered first is greater");
		}
		else
		{
			System.out.println("The number that was entered later is greater");
		}
		scan.close();
		
	}
	
}
