package chapter4;

/**
 * @author Max_CT(imaxct)
 * 
 * @since 2015��11��7�� ����1:08:34
 * 
 * Pro 3.1 ���������
 */
import chapter4.FushuClass;

public class Fushu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FushuClass a = new FushuClass(1, 2);
		FushuClass b = new FushuClass(3, 4);
		System.out.println("������ӣ�" + FushuClass.add(a, b));
		System.out.println("���������" + FushuClass.dec(a, b));
		System.out.println("������ˣ�" + FushuClass.multiply(a, b));
	}

}
