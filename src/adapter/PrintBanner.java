package adapter;

public class PrintBanner extends Banner implements Print{

	//adapterパターン
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printString() {
		showWithAster();
	}

}
