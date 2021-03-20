package singleton;

public class TicketMaker {
	private static int ticket = 1000;
	private static TicketMaker singleton = new TicketMaker();
	private TicketMaker() {
	}

	public static TicketMaker getInstance() {
		return singleton;
	}

	public synchronized int getTicketMaker() {
		return ticket++;
	}
}