package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午8:15:03
 * 
 *        樱桃炸弹
 */

public class CherryBomb extends Plants {
	private String Feature = "Attack zombies, 1800 attackPoints!";

	public CherryBomb() {
		super("CherryBomb", 0, 150, 1800, 300);
	}

	public void attackZombie() {
	}

	public String getFeature() {
		return Feature;
	}

	public void beAttacked(int attackPoint) {
		this.getAttack(attackPoint);
		if (this.getDefendPoint() <= 0)
			this.beKilled();
	}
}
