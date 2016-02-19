package observerDesignPattern;

public class MainClass {

	public static void main(String[] args) {

		MailBox mailBox1 = new MailBox();
		PostOffice postOffice = new PostOffice("Tejkuni Para");

		postOffice.addObserver(mailBox1);
		postOffice.newMail();
		postOffice.removeObserver(mailBox1);

	}
}
