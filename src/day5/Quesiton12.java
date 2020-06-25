package day5;

import java.util.Scanner;

public class Quesiton12 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name= scan.nextLine();
		System.out.println("Enter Roll");
		int roll=scan.nextInt();
		System.out.println(" ");
		System.out.println("Enter Nationality");
		String Nationality=scan.next();
		for(int i=0;i<67;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("** \t Roll \t ** \t Name \t \t ** \t Nationality \t **");
		for(int i=0;i<67;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("** \t" + roll + " \t ** \t" +  name + " \t **        " + Nationality        + " \t **");
		for(int i=0;i<67;i++) {
			System.out.print("*");
		}
	}

}
