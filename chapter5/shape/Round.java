package chapter5.shape;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月30日 下午5:12:24
 * 
 *        pro 3.1 图形类设计--圆形
 */

public class Round extends Shape {
	private String name;
	private double rad;

	public Round(double rad) {
		super("Round");
		this.setName(name);
		this.setRad(rad);
	}

	public double getArea() {
		return Math.PI * this.rad * this.rad;
	}

	public double getCircumference() {
		return (2 * Math.PI * this.rad);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Round rd = new Round(10);
		System.out.println(rd.getArea());
		System.out.println(rd.getCircumference());
	}

}
