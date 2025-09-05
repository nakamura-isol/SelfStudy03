package javadrill.exercise019.question027;

public class BankAccount {
	private String accountNumber;
	private double balance;

	BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	/**
	 * 預金
	 * @param amount
	 */
	void deposit(double amount) {
		balance+=amount;
	}
	/**
	 * 引き落とし
	 * @param amount
	 * @throws InsufficientFundsException
	 */
	void withdraw(double amount)throws InsufficientFundsException{
		if(amount>balance) {
			throw new InsufficientFundsException("残高以内で引き落としてください。") ;
		}
		balance-= amount;
	}
	/**
	 * シミュレートのため、トランザクションのロールバックを実装
	 * @param amount
	 */
	void rollback(double amount) {
		 balance += amount;
	    }
	
}
