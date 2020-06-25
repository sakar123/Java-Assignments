package day4;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Question6

{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	DecimalFormat two_places=new DecimalFormat("0.00");
	boolean string_input=false;
	while(!string_input)
	{
		System.out.println("What do you want to find the perimeter of? circle, rectangle or triangle??");
		String input= scan.next();
		switch (input)
		{
		case "circle":
			System.out.println("Enter the radius of the circle");
			float radius=scan.nextFloat();
			double perimeter_circle=Math.PI*radius*2;
			System.out.println("The perimeter of the circle is " + two_places.format(perimeter_circle));
			break;
		case "rectangle":
			System.out.println("Enter the length of the rectangle");
			float length=scan.nextFloat();
			System.out.println("Enter the width of the rectangle");
			float width=scan.nextFloat();
			double perimeter_rectangle=2*(length+width);
			System.out.println("The perimeter of the rectangle is " + two_places.format(perimeter_rectangle));
			break;
		case "triangle":
			System.out.println("Enter the first side of the triangle");
			float base=scan.nextFloat();
			System.out.println("Enter the second side of the triangle");
			float height=scan.nextFloat();
			System.out.println("Enter the third side of the triangle");
			float height1=scan.nextFloat();
			double perimeter_triangle=base+height+height1;
			System.out.println("The perimeter of the rectangle is " + two_places.format(perimeter_triangle));
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
