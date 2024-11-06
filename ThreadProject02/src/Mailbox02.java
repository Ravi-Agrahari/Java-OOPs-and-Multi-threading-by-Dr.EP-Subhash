
public class Mailbox02 {
	private boolean youHaveMail = false;
	private char [] message;
	private final int MAXMESSAGE = 72;
	private final int MAXPROCESSTIME = 7;

	public Mailbox02() {
		youHaveMail = false;
		message = new char[MAXMESSAGE];
	}

	public  synchronized void storeMessage(String msg) {

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


	public  synchronized String retrieveMessage() {

		if(youHaveMail) {
			String msg =  new String(message,0, MAXMESSAGE);
			youHaveMail = false;
			return (msg );
		}
		else
			return "How sad, no mail.";
	}




}