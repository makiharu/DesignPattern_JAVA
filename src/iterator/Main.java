package iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("ぐりとぐらのーら"));
		bookShelf.appendBook(new Book("だるまちゃんとまるだちゃん"));
		bookShelf.appendBook(new Book("ぽんたの冒険"));
		bookShelf.appendBook(new Book("カラスのパン屋さん"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}
}
