package chapter4;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月7日 下午2:04:29
 * 
 *   买书类
 */
import chapter4.Book;

public class Bag {
	private Book[] books;
	private int total = 0;
	private double volume;

	public Bag(double volume) {
		this.volume = volume;
		books = new Book[100];
	}

	public void buy(Book a) {
		if (volume > a.getWeight()) {
			books[total++] = a;
			volume -= a.getWeight();
			System.out.println("Buy <<" + a.getTitle() + ">> Successfully, the reset volume is " + volume);
		} else {
			System.out.println("Failed to buy <<" + a.getTitle() + ">>, it's too heavy!");
		}
	}

	public String getBookList() {
		String str = "";
		for (int i = 0; i < total; i++) {
			str += books[i].getTitle() + " " + books[i].getPrice() + " " + books[i].getWeight() + "\n";
		}
		return str;
	}

	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	public void setVolume(double volume) {
		this.volume = volume;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
}
