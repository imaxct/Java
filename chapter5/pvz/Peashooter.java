package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015��11��12�� ����7:50:04
 * 
 *        �㶹����
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
