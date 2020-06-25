package test2;
import java.lang.Math;
public class PoudelTakeOut 
{
	public static void displayMainMenu()
	{
		System.out.println("THIS IS THE TAKEOUT MENU");
		System.out.println("CHOOSE TYPE OF MEAL");
		System.out.println("_______________________");
		System.out.println("1. Italian \n 2. Chinese \n 3. American");
		System.out.println("What would you like to order?");
	}
	public static void displayItalianFoodMenu()
	{
		System.out.println("CHOOSE ONE\r\n" + 
				"__________\r\n" + 
				"1. Lasagna Tray - Feeds 5 - 17.99\r\n" + 
				"2. Pizza Pack - Feeds 7 - 15.99\r\n" + 
				"3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99\r\n" + 
				"Enter Choice");
	}
	public static void displayChineseFoodMenu()
	{
		System.out.println("CHOOSE ONE\r\n" + 
				"__________\r\n" + 
				"\r\n" + 
				"1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99\r\n" + 
				"2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99\r\n" + 
				"3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99\r\n" + 
				"Enter Choice");
	}
	public static void displayAmericanFoodMenu()
	{
		System.out.println("CHOOSE ONE\r\n" + 
				"__________\r\n" + 
				"1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99\r\n" + 
				"2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\r\n" + 
				"22.99\r\n" + 
				"3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99\r\n" + 
				"Enter Choice");
	}
	public static int determineTrays(int people, int feeds)
	{
		return ((int)Math.ceil(people/feeds));
	}
	public static double getSubtotal(double price, int trays)
	{
		return (trays*price);
	}
	public static double getTax(double subtotal, double taxrate)
	{
		return ((taxrate/100)*subtotal);
	}
	public static double getTip(double subtotal, double tipRate)
	{
		return ((tipRate/100)*subtotal);
	}
	public static double getGrandTotal(double subtotal, double tax, double tip)
	{
		return (subtotal+tax+tip);
	}
	public static double pricePerPerson(double grandTotal, int people)
	{
		return (grandTotal/people);
	}
	public static int determineLeftOvers(int feeds, int trays, int people)
	{
		return (feeds*trays - people )
;	}
}
