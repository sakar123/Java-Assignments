package day7;

import java.util.Scanner;

public class Question20 
{
/*20. Write a program to create the equivalent of a four-function calculator. The program to
enter two integer’s numbers and an operator. It then carries out the specified
arithmetic operator operation: addition, subtraction, multiplication or division of the
two numbers. Finally, it displays the result.0*/
	
	public static void main(String args[])
	{
		float first_num;
		float second_num;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
		System.out.println("perform the calculation:");
		first_num=scan.nextFloat();
		String sign=scan.next();
		second_num=scan.nextFloat();
		float sum=first_num+second_num;
		float div=first_num/second_num;
		float mul=first_num*second_num;
		float sub=first_num-second_num;
		if(sign.equals("+"))
		{
			System.out.println("The addition of "+first_num+ " and "+second_num+" is "+ sum+".");	
		}
		else if(sign.equals("-"))
		{
			System.out.println("The  subtraction of "+first_num+ " from "+second_num+" is "+ sub+".");
		}
		else if(sign.equals("*"))
		{
			System.out.println("The multiplication of "+first_num+ " and "+second_num+" is "+ mul+".");
		}
		else if(sign.equals("/"))
		{
			System.out.println("The division of "+first_num+ " by "+second_num+" is "+ div+".");
		}
		else
		{
			System.out.println("can not perform calculation!!");
		}
		System.out.println("perform another calculation?");
		String ask=scan.next();
		if(ask.equals("Y")) {
			continue;
		}
		else {
			break;
		}
		}
		scan.close();
		}
	
	}