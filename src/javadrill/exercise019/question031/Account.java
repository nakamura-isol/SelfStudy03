package javadrill.exercise019.question031;

public class Account {
	private int accountId;
	private int balance;
	
	
	Account(int accountId,int balance){
		this.accountId = accountId;
		this.balance = balance;
	}


	int getAccountId() {
		return accountId;
	}


	void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	int getBalance() {
		return balance;
	}


	void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
