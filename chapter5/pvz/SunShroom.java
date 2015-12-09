package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午8:19:44
 * 
 *        阳光蘑菇
 */

public class SunShroom extends Plants {
	private String Feature = "Produce 15 sunshine!";
	private static int sunshine = 0;

	public SunShroom() {
		super("SunShroom", 2, 25, 0, 300);
	}

	public void produceSunshine() {
		sunshine += 15;
	}

	public String getFeature() {
		return Feature;
	}

	public void beAttacked(int attackPoint) {
		this.getAttack(attackPoint);
		if (this.getDefendPoint() <= 0)
			this.beKilled();
	}

	public static int getSunshine() {
		return sunshine;
	}
}
