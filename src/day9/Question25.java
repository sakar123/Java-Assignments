package day9;
import java.util.*;
public class Question25 {
	public static void main (String args []) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of student:");
		int n = input.nextInt();
		int maxScore = 0;
		String studentName = "";
		for (int i=1; i <=n; i++) {
			System.out.println("Enter student name");
			String name = input.next();
			System.out.println("Enter score");
			int score = input.nextInt();
			
			if (score>maxScore) {
				maxScore= score;
				studentName= name;
				
			}
		}
			System.out.println("Student with high score is:" +studentName +" "+ maxScore);
		input.close();
		}
	
}

