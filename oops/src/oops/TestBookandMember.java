package oops;

import lti.lib.Book;
import lti.lib.Member;

public class TestBookandMember {
	public static void main(String[] args) {

		Book alc=new Book("Alchemist");
		Member m=new Member("abc");
		alc.issueBook(m);
		
		alc.getMember();
		alc.returnBook(m);
		
		
		
	}
}
