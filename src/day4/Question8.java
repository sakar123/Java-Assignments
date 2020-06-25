package day4;

import java.text.DecimalFormat;
import java.util.Scanner;

//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class Question8 
{
public static void main(String[] args) 
{
	DecimalFormat two_places=new DecimalFormat("0.00");
	System.out.println("Enter the temperature is this format (For 39degree celsius enter 39 C)");
	Scanner scan=new Scanner(System.in);
	double given_value=scan.nextDouble();
	String given_degree=scan.next();
	double converted_to_f= (given_degree.contentEquals("C"))?(given_value*1.8)+32:given_value;
	double converted_to_c=(given_degree.contentEquals("F"))?(given_value-32)*0.556:given_value;
	System.out.println(two_places.format(converted_to_f) +" degree fahrenheit "+ "= " + two_places.format(converted_to_c) +" degree celsius");
	
}
}
