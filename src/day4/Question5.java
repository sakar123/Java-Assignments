package day4;
//Write a program to find the area of circle, rectangle, and triangle.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question5

{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	DecimalFormat two_places=new DecimalFormat("0.00");
	boolean string_input=false;
	while(!string_input)
	{
		System.out.println("What do you want to find the area of ? circle, rectangle or triangle??");
		String input= scan.next();
		switch (input)
		{
		case "circle":
			System.out.println("Enter the radius of the circle");
			float radius=scan.nextFloat();
			double area_circle=Math.PI*Math.pow(radius, 2);
			System.out.println("The area of the circle is " + two_places.format(area_circle));
			break;
		case "rectangle":
			System.out.println("Enter the length of the rectangle");
			float length=scan.nextFloat();
			System.out.println("Enter the width of the rectangle");
			float width=scan.nextFloat();
			double area_rectangle=length*width;
			System.out.println("The area of the rectangle is " + two_places.format(area_rectangle));
			break;
		case "triangle":
			System.out.println("Enter the base of the triangle");
			float base=scan.nextFloat();
			System.out.println("Enter the height of the triangle");
			float height=scan.nextFloat();
			double area_triangle=0.5*base*height;
			System.out.println("The area of the rectangle is " + two_places.format(area_triangle));
			break;
		}
		System.out.print("Do you want to perform another calculation? y  for yes n for no");
		char check=scan.next().charAt(0);
		if(check=='y')
		{
			string_input=false;
		}
		else
		{
			string_input=true;
		}
	}
			
	System.out.println("Thanks!");
}
}
