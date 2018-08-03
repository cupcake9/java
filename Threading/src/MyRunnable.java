
public class MyRunnable implements Runnable {

	private int data;

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		for (int c = 1; c <= 50; c++)
			System.out.println(name + " " + ++data);
	}

	public static void main(String[] args) {

		MyRunnable mr = new MyRunnable();

		Thread mt1 = new Thread(mr, "First");
		Thread mt2 = new Thread(mr, "Second");
		Thread mt3 = new Thread(mr, "Third");

		mt1.start();
		mt2.start();
		mt3.start();
	}
}
