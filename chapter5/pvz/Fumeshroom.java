package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015��11��12�� ����8:21:34
 * 
 *        ���繽
 */

public class Fumeshroom extends Plants {
	private String Feature = "Attack zombies,20 attackPoints!";

	public Fumeshroom() {
		super("Fumeshroom", 0, 75, 20, 300);
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
