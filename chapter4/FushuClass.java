package chapter4;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月7日 下午1:41:08
 * 
 *        复数类
 */

public class FushuClass {
	private int x;
	private int y;

	public FushuClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static FushuClass add(FushuClass a, FushuClass b) {
		return new FushuClass(a.getX() + b.getX(), a.getY() + b.getY());
	}

	public static FushuClass dec(FushuClass a, FushuClass b) {
		return new FushuClass(a.getX() - b.getX(), a.getY() - b.getY());
	}

	public static FushuClass multiply(FushuClass a1, FushuClass b1) {
		int a = a1.getX();
		int b = a1.getY();
		int c = b1.getX();
		int d = b1.getY();
		return new FushuClass(a * c - b * d, b * c + a * d);
	}

	public String toString() {
		return "" + x + (y > 0 ? "+" : "") + y + "i";
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
}
