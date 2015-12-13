package chapter5.shape;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月30日 下午5:06:18
 * 
 *        pro 3.1 图形类设计--正方形
 */

public class Rectangle extends Shape {
	private String name;
	private double length;
	private double width;

	public Rectangle( int length, int width) {
		super("Rectangle");
		this.setLength(length);
		this.setWidth(width);
	}

	public double getArea() {
		return this.length * this.width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
