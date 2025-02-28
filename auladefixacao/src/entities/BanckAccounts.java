package entities;

public class BanckAccounts {
	
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	public BanckAccounts () {
		
	}
	
	public BanckAccounts(int accountNumber, String accountName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public BanckAccounts(int accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public double DepositAccount (double accountBalance) {
		return this.accountBalance += accountBalance;
	}
	
	public double withdrawalAccount (double accountBalance) {
		return this.accountBalance -= accountBalance;
	}

	@Override
	public String toString() {
		return "BanckAccounts [getAccountNumber()=" + getAccountNumber() + ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}
	
	
	
}
