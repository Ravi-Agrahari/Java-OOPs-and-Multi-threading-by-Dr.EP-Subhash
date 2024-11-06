public class ThreadSync02 {

	public static void main(String [] args) {
		Mailbox02 mailbox = new Mailbox02();
		Consumer02 cons1 = new Consumer02(mailbox);
		Producer02 prod1 = new Producer02( mailbox, "Dave-2", "Hello, world.");
		Producer02 prod2 = new Producer02(mailbox, "Bill-2", "Hot dog!");
		prod1.setPriority(1);
		prod2.setPriority(4);
		cons1.setPriority(10);
		cons1.start();
		prod1.start();
		prod2.start();
	}
}

