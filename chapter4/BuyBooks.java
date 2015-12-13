package chapter4;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月7日 下午2:14:22
 * 
 * demo
 */
import chapter4.Book;
import chapter4.Bag;

public class BuyBooks {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book books[] = new Book[20];
		books[0] = new Book("Book1", 20.5, 10.3);
		books[1] = new Book("Book2", 21.5, 1.3);
		books[2] = new Book("Book3", 22.5, 5.3);
		books[3] = new Book("Book4", 23.5, 120.3);
		books[4] = new Book("Book5", 24.5, 30.5);

		Bag bag = new Bag(95.6);
		bag.buy(books[0]);
		bag.buy(books[1]);
		bag.buy(books[2]);
		bag.buy(books[3]);
		bag.buy(books[4]);
	}

}
