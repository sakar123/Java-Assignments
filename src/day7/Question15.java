package day7;

import java.util.Scanner;

public class Question15
{
	/*15. Write a program that receives an ASCII code (between 0 – 128) and display its character
[example: 97 (input) -&gt;a(output)].*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ASCII code (0-128)");
		int ascii = scan.nextInt();
		char con_ascii= (char) ascii;
		System.out.println("The character for given ascii code is " + con_ascii);
		scan.close();
	}

}
