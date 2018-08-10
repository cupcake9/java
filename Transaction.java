package lti.account;

public class Transaction {

	private String Type;
	private double amount;
	private double balance;
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
