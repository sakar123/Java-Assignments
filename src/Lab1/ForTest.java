package Lab1;

public class ForTest
{
public static void main(String[] args) {
	//creating three users with two different constructor calls
	BankAccount User1 = new BankAccount("Sakar Poudel", 10000);
	BankAccount User2 = new BankAccount("Ram Prasad", 5000);
	BankAccount User3 = new BankAccount("Khali Prasad");
	
	
	// testing for $1050.50 deposit
	User1.deposit(1050.50);
	User2.deposit(1050.50);
	User3.deposit(1050.50);
	
	//testing for adding 5% interest 
	User1.deposit(5, "%");
	User2.deposit(5, "%");
	User3.deposit(5, "%");
	
	//testing for $1050.50 withdrawal
	User1.withdraw(1050.50);
	User2.withdraw(1050.50);
	User3.withdraw(1050.50);
	
	//testing for $100 fee 
	User1.withdraw("fee", 100);
	User2.withdraw("fee", 100);
	User3.withdraw("fee", 100);
	
	//displaying info of all the users
	User1.disp_info();
	User2.disp_info();
	User3.disp_info();
}
}
