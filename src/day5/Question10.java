package day5;

public class Question10 
{
	public static void main(String[] args) {
		//10.a
		int u=5,t=9;
		float a=9.8F;
		float s= (float) (u*t + (0.5*a*Math.pow(a, 2)));
		//10.b
		int b=6,c=7;
		float area= (float) Math.sqrt(s * (s-a) * (s-b) * (s-c));
		//10.c
		double x =(double)(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
	}
}
