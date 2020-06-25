package day5;

public class Question11
{
public static void main(String[] args) {
	//using temp variable
	int a=5, b=6;
	System.out.println("Inital");
	System.out.println("a:" + a + " b: " + b);
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("Swapping with temp");
	System.out.println("a:" + a + " b: " + b);
	//without using temp variable
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Swapping without temp");
	System.out.println("a:" + a + " b: " + b);
}
}
