package javadrill.exercise019.question027;

public class BankTransactionSimulation {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("112233", 1000.0);
		try {
			// 預金
			bankAccount.deposit(500.0);
			try {
				// 引き落とし
				bankAccount.withdraw(2000.0);
			} catch (InsufficientFundsException e) {
				System.out.println(e.getMessage());
				// 残高不足のためロールバック
				bankAccount.rollback(500.0);
			}
			// 再度正常な取引
			bankAccount.withdraw(200.0);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
