package chapter5.pvz;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月12日 下午8:09:38
 * 
 *        向日葵
 */

public class SunFlower extends Plants {
	private String Feature = "Produce 25 sunshine!";
	private static int sunshine = 0;

	public SunFlower() {
		super("SunFlower", 2, 50, 0, 300);
	}

	public void produceSunshine() {
		sunshine += 25;
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
