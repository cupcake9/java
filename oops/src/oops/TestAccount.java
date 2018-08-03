package oops;

import lti.bank.AccountFactory;
import lti.bank.BalanceException;
import lti.bank.Bank;

public class TestAccount {

	public static void main(String[] args) {

		Bank sav = AccountFactory.openAccount("Current", "Polo");
		sav.summary();
		sav.deposit(2000);
		sav.deposit(4000);
		// sav.withdraw(3000);
		try {
			sav.withdraw(7000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); // for developers to troubleshoot
			// System.out.println(e); // for logging purpose to audit
			System.out.println(e.getMessage()); // for end users
		}
		// sav.withdraw(2000);
		sav.statement();
	}

}
