package lti.lib;

public class Book {

	private String title;
	private Member member;

	public String getTitle() {
		return title;
	}

	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public void issueBook(Member m) {
		if (member != null)
			System.out.println(title + " already issued to " + member.getName());
		else {
			this.member = m;
			m.setB(this);
			System.out.println(title + "is issued to " + member.getName());
		}
	}

	public void returnBook(Member m) {
		if (member == null || !member.getName().equals(m.getName()) || m.getB() == null)
			System.out.println(title + "not issued to " + m.getName());
		else {
			this.member = null;
			m.setB(null);
			System.out.println(title + " is returned by " + m.getName());
		}
	}

	public Member getMember() {
		return member;
	}

	
}
