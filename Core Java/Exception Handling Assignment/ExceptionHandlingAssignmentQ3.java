
import java.util.*;

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String s) {
		super(s);
	}
}

class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String s) {
		super(s);
	}
}

public class ExceptionHandlingAssignmentQ3 {
	long id;
	static double balance = 10000;
	static double amount=0.0;
	double deposit(double amount) {
		balance = balance + amount;
		System.out.println("After depositing, balance: "+balance);
		return balance;
	}
	
	double withdraw(double amount) {
		System.out.println("Before depositing, balance: "+balance);
		balance = balance - amount;
		System.out.println("After depositing, balance: "+balance);
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandlingAssignmentQ3 e = new ExceptionHandlingAssignmentQ3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi, Deposit/withdraw?");
		System.out.println("Press 1 to deposit money.");
		System.out.println("Press 2 to withdraw money.");
		int number;
		number = sc.nextInt();
		switch(number) {
		case 1->{
			System.out.println("Enter the amount you want to deposit:");
			amount = sc.nextDouble();
			e.deposit(amount);
		}
		case 2->{
			try {
			System.out.println("Enter the amount you want to withdraw:");
			amount = sc.nextDouble();
			if(amount == 0 || amount>balance) {
				throw new InsufficientBalanceException("Insufficient balance.");
			}
			else if(amount<0) {
				throw new IllegalBankTransactionException("Negative value entered!");
			}
			else {
				e.withdraw(amount);
				System.out.println("Withdrawal done.");
			}
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		default->{
			System.out.println("Enter only 1 or 2.");
		}
		
		}

	}

}