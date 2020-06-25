package day11;

import java.util.Scanner;

public class Question32 
{
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int[] given_array= new int[10];
	int sum=0;
	System.out.println("Enter 5 numbers");
	for(int i=0; i<5; i++)
	{
		given_array[i]= scan.nextInt();
		sum=sum+ given_array[i];
	}
	System.out.println("SUM IS " + sum);
}
}
