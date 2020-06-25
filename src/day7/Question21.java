package day7;

import java.util.Scanner;

public class Question21 
{
/*21. Program to input the number of (1...7) and translate to its equivalent name of the day of
the week.*/
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in)	;
		System.out.println("Enter the number of the day ");
		int given= scan.nextInt();
		switch (given)
		{
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			 break;
		default:
			System.out.println("Enter numbers between 1 to 7 only");
			break;
		}
		scan.close();
		
	}
}


