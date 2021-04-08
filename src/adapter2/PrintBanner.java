package adapter2;

import adapter.Banner;

//委譲
public class PrintBanner extends Print{
	private Banner banner;
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printString() {
		banner.showWithAster();
	}

}
