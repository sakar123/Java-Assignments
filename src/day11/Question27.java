package day11;

import java.util.Scanner;

public class Question27 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String given= scan.next();
		int converted_sum=0;
		int converted_mul=1;
		for(int i=0; i<given.length();i++)
		{
			String take= Character.toString((given.charAt(i)));
			converted_sum= (Integer.parseInt(take))+converted_sum;
			converted_mul= (Integer.parseInt(take))*converted_mul;
			
		}
		System.out.println(converted_mul + "   " + converted_sum);
		System.out.println();
	}

}
