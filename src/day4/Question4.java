
package day4;

import javax.swing.JOptionPane;

//Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
public class Question4 {
	public static void main(String args[])
	{
		int principle= Integer.parseInt(JOptionPane.showInputDialog("Enter Principle"));
		int rate= Integer.parseInt(JOptionPane.showInputDialog("Enter Rate"));
		int time= Integer.parseInt(JOptionPane.showInputDialog("Enter Time"));
		JOptionPane.showMessageDialog(null,"The interest is "+ ((principle*rate*time)/100));
	}

}
