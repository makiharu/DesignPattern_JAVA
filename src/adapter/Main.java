package adapter;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("hoge");
		p.printString();
		p.printWeak();

	}
}
