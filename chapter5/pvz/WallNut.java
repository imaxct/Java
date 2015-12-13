package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午8:17:38
 * 
 *        坚果
 */

public class WallNut extends Plants {
	private String Feature = "Prevent zombies move forward, 4000 defendPoints!";

	public WallNut() {
		super("WallNut", 1, 50, 0, 4000);
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
