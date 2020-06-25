package day4;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Question7
{
	public static void main(String args[])
	{
		DecimalFormat two_places=new DecimalFormat("0.00");
		int length= Integer.parseInt(JOptionPane.showInputDialog("Enter the height of the cylinder"));
		int radius= Integer.parseInt(JOptionPane.showInputDialog("Enter the radius of the cylinder"));
		
		JOptionPane.showMessageDialog(null,"The volume is "+ (two_places.format((Math.PI*Math.pow(radius,2)*length))));
	}

}
