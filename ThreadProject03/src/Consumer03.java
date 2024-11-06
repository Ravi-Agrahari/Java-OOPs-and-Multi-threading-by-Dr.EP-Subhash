public class Consumer03 extends Thread {
	private Mailbox03 myMailbox;
	private final int CHECKTIME = 20;

	public Consumer03(Mailbox03 box) {
		myMailbox = box;
	}

	public void run () {
		while(true) {
			System.out.println("Looking for my mail ..");
			System.out.println(myMailbox.retrieveMessage());
			try {
				Thread.sleep(CHECKTIME);
			}
			catch (InterruptedException e) {}

		}
	}
}