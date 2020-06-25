
package day12;

import java.util.Scanner;

public class Assignment1 
{
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
	public void fibonacci(long a)
	{
		
		int first =0, second =1, i=0;; 
		
			
		System.out.println("\nThe fibonacci serie is given by: \n");
		
		if (a < 1)
			return;
		while(i < a)
		{
			i++;
			System.out.print(second + " ");
			int temp = first + second ;
			first = second;
			second = temp; 
		}
		System.out.println();
	}
	public void sum_natural(int num)
	{
    int sum = 0;

    for(int i = 1; i <= num; i++) {

        sum += i;
    }

    System.out.println("\nSum of first " + num + " natural numbers : " + sum);
	}
	
	public void factorial(int num)
	{
		long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        System.out.println();
	}
	public void reverse(int num)
	{
	int reversenum =0;
	while( num != 0 )
    {
        reversenum = reversenum * 10;
        reversenum = reversenum + num%10;
        num = num/10;
    }

    System.out.println("Reverse of input number is: "+reversenum);
	}

}
