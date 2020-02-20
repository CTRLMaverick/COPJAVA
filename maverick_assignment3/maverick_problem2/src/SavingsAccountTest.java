package src;

public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1, saver2;
		saver1 = new SavingsAccount (2000.00);
		saver2 = new SavingsAccount (3000.00);
		
		SavingsAccount.modifyInterestRate (0.04);
		System.out.println("Printing Balance for Saver 1\n");
		for(int i=0;i<12;i++) {
			saver1.calculateMonthlyInterest();
			System.out.println("Month "+(i+1)+ ": "+String.format("%.2f", saver1.getSavingsBalance()));
		}
		System.out.println("\nPrinting Balance for Saver 2\n");
		for(int i=0;i<12;i++) {
			saver2.calculateMonthlyInterest();
			System.out.println("Month "+(i+1)+ ": "+String.format("%.2f", saver2.getSavingsBalance()));
		}
		
		SavingsAccount.modifyInterestRate (0.05);
		System.out.println("\nPrinting Balance for Saver 1\n");
		for(int i=0;i<12;i++) {
			saver1.calculateMonthlyInterest();
			System.out.println("Month "+(i+1)+ ": "+String.format("%.2f", saver1.getSavingsBalance()));
		}
		System.out.println("\nPrinting Balance for Saver 2\n");
		for(int i=0;i<12;i++) {
			saver2.calculateMonthlyInterest();
			System.out.println("Month "+(i+1)+ ": "+String.format("%.2f", saver2.getSavingsBalance()));
	}
  }
}
