package day5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		DecimalFormat three_places= new DecimalFormat("0.000");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of pounds");
		double pounds = scan.nextDouble();
		double kgs= pounds*0.453;
		System.out.println(pounds + " pound is " + three_places.format(kgs) + " kg.");
		
	}
}
