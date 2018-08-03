package lti.lib;
public class Member {

	private String name;
	private Book b;

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public Member() {
	}

	public Member(String name) {
		this.name = name;
	}

	public void issuedBook() {
		if (b != null)
			System.out.println(name+ " issued "+b.getTitle());
		else 
			System.out.println(name+" not issued");
	}

}
