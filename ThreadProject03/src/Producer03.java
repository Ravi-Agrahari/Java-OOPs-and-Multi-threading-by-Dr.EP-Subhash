
public class Producer03 extends Thread {

	private final int DELAY = 131;
	private Mailbox03 myMailbox;

	private String msg;
	private String name;

	public Producer03 (Mailbox03 box, String name, String msg) {
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
