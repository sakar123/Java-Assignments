package test2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Test 
{
public static void main(String[] args) {
	DecimalFormat two_places = new DecimalFormat("0.00");
	System.out.println(" \t WELCOME TO APARTMENT TAKEOUT");
	System.out.println("How many people are ordering today?");
	Scanner scan= new Scanner(System.in);
	int number_of_people = scan.nextInt();
	if(number_of_people > 100 )
	{
			System.exit(0);//terminate the program
	}
	PoudelTakeOut object = new PoudelTakeOut();
	int trays=0, feeds=0, total_feeds=0;
	double price =0 , subtotal =0, tax =0, tip=0, grandtotal=0;
	object.displayMainMenu();
	String meal_choice = scan.next();
	if(meal_choice.equalsIgnoreCase("Italian") || meal_choice.equals("1"))
	{
		object.displayItalianFoodMenu();
		int italian_choice =scan.nextInt();
		switch(italian_choice)
		{
		case 1:
			price = 17.99;
			feeds = 5;
			break;
		case 2:
			price = 15.99;
			feeds = 7;
			break;
		case 3:
			price = 12.99;
			feeds = 4;
			break;
		default:
			System.exit(0);
		}
	}
	else if(meal_choice.equalsIgnoreCase("Chinese") || meal_choice.equals("2"))
	{
		object.displayChineseFoodMenu();
		int chinese_choice =scan.nextInt();
		switch(chinese_choice)
		{
		case 1:
			price = 18.99;
			feeds = 7;
			break;
		case 2:
			price = 18.99;
			feeds = 7;
			break;
		case 3:
			price = 10.99;
			feeds = 5;
			break;
		default:
			System.exit(0);
		}
	}
	else if(meal_choice.equalsIgnoreCase("American") || meal_choice.equals("3"))
	{
		object.displayAmericanFoodMenu();
		int american_choice =scan.nextInt();
		switch(american_choice)
		{
		case 1:
			price = 21.99;
			feeds = 8;
			break;
		case 2:
			price = 22.99;
			feeds = 8;
			break;
		case 3:
			price = 26.99;
			feeds = 10;
			break;
		default:
			System.exit(0);
		}
	}
	else
	{
		System.exit(0);
	}
	total_feeds = feeds * object.determineTrays(number_of_people, feeds);
	System.out.println("You  need " + object.determineTrays(number_of_people, feeds) + " trays");
	System.out.println("Feeds: " + total_feeds);
	System.out.println("Price for "+ number_of_people + "(" + object.determineTrays(number_of_people, feeds)+"):" +object.getSubtotal(price, object.determineTrays(number_of_people, feeds)));
	System.out.println("Tax: "+ two_places.format(object.getTax(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), 7)));
	System.out.println("Tip:" + two_places.format(object.getTip(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), 15)));
	System.out.println("Total (food,tax,tip): "+ two_places.format(object.getGrandTotal(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), object.getTax(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), 7), object.getTip(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), 15))));
	System.out.println("Price per person: " + two_places.format(object.pricePerPerson(object.getGrandTotal(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), object.getTax(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), 7), object.getTip(object.getSubtotal(price, object.determineTrays(number_of_people, feeds)), 15)), number_of_people)));
	System.out.println("Leftover servings fot the delivery person: " + object.determineLeftOvers(feeds, object.determineTrays(number_of_people, feeds), number_of_people));
	System.out.println("\n\n\n\t THANK YOU!!!");
	
}
}
