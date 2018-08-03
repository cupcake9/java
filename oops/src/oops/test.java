package oops;

public class test {

	public static void main(String[] args) {
		
		try {
			System.out.println("in try");
			//System.exit(1);
			System.exit(0);
		}
		
		finally {
			System.out.println("in finally");
		}
	}
}
