package day11;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in); 
		Question28 obj = new Question28(); 
		
		System.out.println("To check either the given number is prime or not");
		System.out.print("\nEnter the number: ");
		int number = sc.nextInt();
		
		
		boolean check = obj.isPrimeNumber(number);
		
		String print = (check) ? "\nGiven number is PRIME": "\ngiven number is NOT PRIME"; 
		
		System.out.println(print);
		

		
		
		System.out.println("To print first nth prime numbers");
		
		System.out.print("\nEnter the number: ");
		int num =sc.nextInt(); 
		
		System.out.println("\nThe Prime numbers upto " + num + " are: \n");
		obj.firstNthPrime(num);
		

		
		
		
		System.out.println("To Print all prime between given two numbers");
		
		System.out.print("\nEnter first number: ");
		int first = sc.nextInt();
		
		System.out.print("\nEnter second number: ");
		int second = sc.nextInt(); 
		
		System.out.println("\nPrime number between " + first + " and "+ second + " are: \n");
		obj.allPrimeBetween(first, second);
		
		
		
		sc.close();
		
	}
	
	
	public boolean isPrimeNumber(int a)
	{
		
		if (a >0 && a <=2)
			return true; 
		if(a == 0)
			return false;
		
		for (int i=2; i< a; i++)
		{
			if (a%i == 0)
				return false; 
			
		}
		
		return true; 
	}
	
	
	public void firstNthPrime(int a)
	{
		for (int i=1; i< a; i++)
		{
			if(isPrimeNumber(i))
				System.out.print(i + " ");
			
		}
	}
	
	public void allPrimeBetween(int a, int b) {
		
		for (int i=a; i<b; i++)
		{
			if(isPrimeNumber(i))
				System.out.print(i + " ");
		}
	}

}
