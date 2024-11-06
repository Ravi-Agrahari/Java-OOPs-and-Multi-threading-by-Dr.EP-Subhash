public class ThreadSync03 {

	public static void main(String [] args) {
		Mailbox03 mailbox = new Mailbox03();
		Consumer03 cons1 = new Consumer03(mailbox);
		Producer03 prod1 = new Producer03(mailbox, "Dave-3", "Hello, world.");
		Producer03 prod2 = new Producer03(mailbox, "Bill-3", "Hot dog!");
		cons1.start();
		prod1.start();
		prod2.start();
	}
}

