package day12;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		Assignment1 object = new Assignment1();
		int operation=0;
		boolean again = true;
		do {
			System.out.println("What would you like to do today? \n Here are the options: \n 1. Check if the number is prime"
					+ " \n 2. Generate fibonacci series \n 3.Find the sum of n natural number \n 4. Find factorial of a number \n 5. Get the reverse of a number"
					+ "\n Enter the number for any of the above operation ");
			int operation_number= scan.nextInt();
		switch(operation_number)
		{
		case 1:
			System.out.println("Enter a number to check if it is prime :");
			operation= scan.nextInt();
			if(object.isPrimeNumber(operation)==true)
				{
				System.out.println(operation + " is a prime number");
				}
			else {
				System.out.println(operation + " is not a prime number");
			}
			break;
		case 2:
			System.out.println("Enter a number upto which you want to generate fibonacci sequence:");
			operation= scan.nextInt();
			object.fibonacci((long)operation);
			break;
		case 3:
			System.out.println("Enter a number upto which you want the sum of the natural numbers : ");
			operation= scan.nextInt();
			object.sum_natural(operation);
			break;
		case 4:
			System.out.println("Enter a number of which you want to find the factorial : ");
			operation= scan.nextInt();
			object.factorial(operation);
			break;
		case 5:
			System.out.println("Enter a number of which you want to see the reverse : ");
			operation= scan.nextInt();
			object.reverse(operation);
			break;
		default:
			break;
			
		}
		System.out.println("Do you want to perform another operation? ");
		String user_input = scan.next();
		if(user_input.equalsIgnoreCase("yes")) {
			again = true;
		}
		else {
			again= false;
		}
		}while(again == true);
	}

}