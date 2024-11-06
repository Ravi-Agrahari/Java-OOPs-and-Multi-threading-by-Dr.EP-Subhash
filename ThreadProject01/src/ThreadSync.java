
public class ThreadSync {

	public static void main(String [] args) {
		Mailbox mailbox = new Mailbox();
		Consumer cons1 = new Consumer(mailbox);
		Producer prod1 = new Producer( mailbox, "Dave-1", "Hello, world.");
		Producer prod2 = new Producer(mailbox, "Bill-2", "Hot dog!");
		cons1.start();
		prod1.start();
		prod2.start();
	}
}

