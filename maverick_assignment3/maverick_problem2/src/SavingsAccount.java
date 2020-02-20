package src;

public class SavingsAccount {
	private double savingsBalance;
	static private double annualInterestRate;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance=savingsBalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
 	public void calculateMonthlyInterest() {
 		double monthlyInterest;
		monthlyInterest=(double)(annualInterestRate*this.savingsBalance/12);
		this.savingsBalance+=monthlyInterest;
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate=newInterestRate;
		
	}
}
