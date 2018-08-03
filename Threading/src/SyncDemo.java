
public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);
	}
private Object dummy= new Object();
	private void display(String name) {
		System.out.println("thread entered");
		synchronized (dummy) {

			try {
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.print("]");
			} catch (InterruptedException e) {
			}

		}
		System.out.println("thread exited");
	}

	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		Thread t1 = new Thread(sd, "alpha");
		Thread t2 = new Thread(sd, "bravo");
		Thread t3 = new Thread(sd, "charlie");
		t1.start();
		t2.start();
		t3.start();
	}

}
