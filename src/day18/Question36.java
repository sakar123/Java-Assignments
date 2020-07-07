package day18;

import java.util.Scanner;

public class Question36 
{
	public int sum (int [] given_array)
	{
		int sum = 0;
		for (int i = 0; i<given_array.length;i++)
		{
			sum = sum+given_array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner scan =new Scanner(System.in);
		for(int i =0; i<5;i++)
		{
			arr[i] = scan.nextInt();
		}
		Question36 ob = new Question36();
		System.out.println("The sum of the given array is" + ob.sum(arr));
		
		
	}

}
