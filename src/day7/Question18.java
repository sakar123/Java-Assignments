package day7;

import java.util.Scanner;

public class Question18 
{
/*18. Write a program to display largest number from given three values.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three integer separated with spaces");
		int a= scan.nextInt(), b=scan.nextInt(), c=scan.nextInt()	;
		System.out.println(largest(a,b,c) + " is the largest number");
		
		scan.close();
	}
	public static int largest(int x, int y, int z) {
		int largest=0;
		if(x>y && x>z)
		{
			largest=x;
			return largest;
		}
		else if(y>x && y>z)
		{
			largest=y;
			return largest;
		}
		else
		{
			largest=z;
			return largest;
		}
		
	}
	
	
}
