package singleton;

public class TicketMain {
	public static void main(String[] args) {
		System.out.println("Start");
		for(int i=0; i < 10; i ++) {
			System.out.println(TicketMaker.getInstance().getTicketMaker());
		}
		System.out.println("End");
	}
}
