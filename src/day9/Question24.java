package day9;
import java.util.*;
public class Question24 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the number to find the Factorial");
        int num = input.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
