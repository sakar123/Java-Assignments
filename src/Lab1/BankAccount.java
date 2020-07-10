package Lab1;

import java.text.DecimalFormat;

public class BankAccount 
{
	private double balance;
	private static int acc_number;
	private int acc_no;
	private String name;
	DecimalFormat two_places = new DecimalFormat("0.00");
	BankAccount(String name, int in_balance){
		this.name = name;
		balance = in_balance;
		acc_number++;
		acc_no = acc_number;
		System.out.println("##################### \n");
		System.out.println("Account created for " + name);
		disp_info();
	}
	BankAccount(String name){
		this.name = name;
		balance = 0;
		acc_no = acc_number+1;
		System.out.println("##################### \n");
		System.out.println("Account created for " + name);
		disp_info();
	}
	public void withdraw(double amount) {
		if(amount > balance)
		{
			System.out.println("\n##################### \n");
			System.out.println("Cannot withdraw. Balance not enough");
			disp_info();
		}
		else
		{
			System.out.println("\nn##################### \n");
			System.out.println("Withdraw successful!");
			balance = balance-amount;
			disp_info();
		}
	}
	public void withdraw(String a, double amount)
	{
		if(a.equalsIgnoreCase("fee"))
		{
			System.out.println("\n##################### \n");
			System.out.println("A fee has been applied");
			balance = balance-amount;
			disp_info();
		}
		else
		{	
			System.out.println("\n##################### \n");
			System.out.println("Fee could not be applied!! Try Again Later");
		}
	}
	public void deposit(double amount) {
		System.out.println("\n##################### \n");
		System.out.println(amount + " is deposited into " +name + "'s account");
		balance = balance + amount;
		disp_info();
	}
	public void deposit(double interest, String a)
	{
		if(a.equalsIgnoreCase("%"))
		{
			System.out.println("\n##################### \n");
			System.out.println("An interest of " +interest + "% has been applied");
			balance = balance + ((interest/100)*balance);
			disp_info();
		}
		else
		{	
			System.out.println("\n##################### \n");
			System.out.println("Interest could not be applied!! Try Again Later");
		}
	}
	public void disp_info()
	{
		System.out.println("Name: " + name);
		String formated_acc = String.format("%07d", acc_no);
		System.out.println("The account number " + formated_acc+ " has a balance of "+ "$"+ two_places.format(balance));
		System.out.println("\n##################### \n");
	}
}
