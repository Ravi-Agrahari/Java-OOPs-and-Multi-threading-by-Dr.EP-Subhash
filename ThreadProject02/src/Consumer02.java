
public class Consumer02 extends Thread {
	private Mailbox02 myMailbox;
	private final int CHECKTIME = 20;

	public Consumer02(Mailbox02 box) {
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