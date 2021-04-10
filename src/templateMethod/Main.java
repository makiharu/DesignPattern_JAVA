package templateMethod;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay a = new CharDisplay('s');
		a.display();

		AbstractDisplay s = new StringDisplay("Hello, world");
		s.display();
	}
}
