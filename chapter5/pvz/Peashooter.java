package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午7:50:04
 * 
 *        豌豆射手
 */

public class Peashooter extends Plants {
	private String Feature = "Attack zombies,20 attackPoints!";

	public Peashooter() {
		super("Peashooter", 0, 100, 20, 300);
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
