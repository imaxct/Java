package chapter5.shape;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午7:31:09
 * 
 *        pro 3.1 图形类设计
 */

public class Shape {
	private String name;

	public Shape() {

	}

	public Shape(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
