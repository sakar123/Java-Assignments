package day9;
import java.util.Scanner;
public class Question23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take number from user
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++) {

            sum += i;
        }

        System.out.println("\nSum of first " + num + " natural numbers : " + sum);
    }

}
