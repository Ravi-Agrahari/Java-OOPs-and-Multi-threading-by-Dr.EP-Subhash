public class Consumer extends Thread {
	private Mailbox myMailbox;
	private final int CHECKTIME = 20;

	public Consumer(Mailbox box) {
		myMailbox = box;
	}

	public void run () {
		while(true) {
			System.out.println(myMailbox.retrieveMessage());
			try {
				Thread.sleep(CHECKTIME);
			}
			catch (InterruptedException e) {}

		}
	}
}