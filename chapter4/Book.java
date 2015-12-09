package chapter4;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月7日 下午2:01:00
 * 
 *        书类
 */

public class Book {
	private double price;
	private double weight;
	private String title;

	public Book() {

	}

	public Book(String title, double price, double weight) {
		this.setTitle(title);
		this.setPrice(price);
		this.setWeight(weight);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
