package oops;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the email address:");
		email = sc.nextLine();

		int i1 = (email.indexOf('@') == email.lastIndexOf('@')) ? email.indexOf('@') : -1;
		int i2 = (email.indexOf('.') == email.lastIndexOf('.')) ? email.indexOf('.') : -1;

		if (i1 < 0 || i2 < 0 || i1 < 4 || (i2 - i1) < 3 || i2 < 8 || i1 < i2)
			System.out.println("rejected");
		else
			System.out.println("accepted");
		sc.close();
	}

}
