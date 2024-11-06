
public class Mailbox {
	private boolean youHaveMail;
	private char [] message;
	private final int MAXMESSAGE = 72;
	private final int MAXPROCESSTIME = 7;


	public Mailbox() {
		youHaveMail = false;
		message = new char[MAXMESSAGE];
	}

	public  void storeMessage(String msg) {

		for(int i = 0; i < msg.length(); i++) {
			message[i] = msg.charAt(i);
			try {
				Thread.sleep((int) (MAXPROCESSTIME * Math.random()));
			}
			catch (InterruptedException e) {}
		}
		for(int i = msg.length(); i < MAXMESSAGE; i++)
			message[i] = ' ';
		youHaveMail = true;
	}


	public String retrieveMessage() {

		if(youHaveMail) {
			String msg =  new String(message,0, 72);
			youHaveMail = false;
			return (msg );
		}
		else {
			return "How sad, no mail ..";
		}
	}
}