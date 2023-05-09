import java.util.Date;

//Account class
public class Exercise09_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account();
		account1.setId(1122);
		account1.setBalance(20000);
		Account.setAnnualInterestRate(4.5);
		
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("Account Balance: " + account1.getBalance()
						+ "\nMonthly Interest: " + account1.getMonthlyInterest()
						+ "\n Date Created: " + account1.getDateCreated());
						
	}

}

class Account{
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private java.util.Date dateCreated;

	public Account() {
		dateCreated = new Date();
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public static double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	public double getMonthlyInterest() {
		return this.balance * (annualInterestRate / 1200);
	}

	public void withdraw(double withdraw) {
		this.balance -= withdraw;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}



}