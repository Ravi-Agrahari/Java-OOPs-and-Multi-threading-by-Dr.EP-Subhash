public class Producer extends Thread {

	private final int DELAY = 131;
	// if 100 messages mixed up.
	private Mailbox myMailbox;
	private String msg;
	private String name;

	public Producer (Mailbox box, String name, String msg) {
		this.msg = msg;
		this.name = name;
		myMailbox = box;
	}

	public void run() {
		while(true) {
		try {
				myMailbox.storeMessage("My name is, " + name + ". " +
										"I say, " + msg);
				sleep((int) (DELAY * Math.random()));
			} catch (InterruptedException e) {}
		}
	}
}
