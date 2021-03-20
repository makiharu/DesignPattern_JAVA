package singleton;

/**
 * 練習問題5-1
 * @author haru
 *
 */
public class TicketMain {
	public static void main(String[] args) {
		System.out.println("Start");
		for(int i=0; i < 10; i ++) {
			System.out.println(TicketMaker.getInstance().getTicketMaker());
		}
		System.out.println("End");
	}
}
