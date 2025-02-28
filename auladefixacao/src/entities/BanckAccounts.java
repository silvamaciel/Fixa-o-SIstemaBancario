package entities;

public class BanckAccounts {

	private String accountNumber;
	private String accountName;
	private double accountBalance;
	private double txBank = 5;
	public BanckAccounts() {

	}

	public BanckAccounts(String accountNumber, String accountName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public BanckAccounts(String accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public String getAccountNumber() {
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

	public double DepositAccount(double accountBalance) {
		return this.accountBalance += accountBalance;
	}

	public double withdrawalAccount(double accountBalance) {
		return this.accountBalance -= accountBalance-txBank;
	}

	@Override
	public String toString() {
		return "Your Account Number: " + getAccountNumber() 
				+ ",\n Account Name: " + getAccountName() 
				+ ",\n Account Balance = R$"	+ getAccountBalance();
	}

}
