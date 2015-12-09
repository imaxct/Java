package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午7:44:46
 * 
 *        植物类
 */

public class Plants {
	private String name;
	private int type; // 0 attack 1 defend 2 producer
	private int price;
	private int attackPoint;
	private int defendPoint;

	public Plants(String name, int type, int price, int attackPoint, int defendPoint) {
		setName(name);
		setType(type);
		setPrice(price);
		setAttackPoint(attackPoint);
		setDefendPoint(defendPoint);
	}

	public void getAttack(int attackPoint) {
		this.defendPoint -= attackPoint;
	}

	public void beKilled() {
		System.out.println("Oh! The " + this.getName() + " was killed!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	public int getDefendPoint() {
		return defendPoint;
	}

	public void setDefendPoint(int defendPoint) {
		this.defendPoint = defendPoint;
	}

}
