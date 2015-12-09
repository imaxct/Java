package chapter4;

/**
 * @author Max_CT(imaxct)
 * 
 * @since 2015年11月7日 下午1:08:34
 * 
 * Pro 3.1 复数类测试
 */
import chapter4.FushuClass;

public class Fushu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FushuClass a = new FushuClass(1, 2);
		FushuClass b = new FushuClass(3, 4);
		System.out.println("复数相加：" + FushuClass.add(a, b));
		System.out.println("复数相减：" + FushuClass.dec(a, b));
		System.out.println("复数相乘：" + FushuClass.multiply(a, b));
	}

}
