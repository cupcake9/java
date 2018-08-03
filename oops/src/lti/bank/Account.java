package lti.bank;

/**
 * this class represents bank account.
 * 
 * @author tvv
 * @version
 */
public abstract class Account implements Bank {
	private int actno;
	private String holder;
	protected double bal;

	private static int autogen = INIT_ACNT_NO;
	protected Transactions[] txns;
	protected int idx = 0;

	public Account() {

	}

	public Account(String holder, double bal) {

		this.actno = autogen++;
		this.holder = holder;
		this.bal = bal;
		// transaction array

		txns = new Transactions[10];

	}

	public void summary() {
		System.out.println("a/c no:" + actno);
		System.out.println("holder" + holder);
		System.out.println("balance" + bal);

	}

	public double getBal() {
		return bal;
	}

	public void deposit(double amount) {
		bal += amount;
		txns[idx++] = new Transactions("Cr", amount, bal);
	}

	// public abstract void withdraw(double amount);

	public void statement() {
		System.out.println("Statement of A/C:" + actno);
		for (int i = 0; i < idx; i++)
			System.out.println(txns[i]);
	}
}
