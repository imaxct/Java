package chapter1;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015��11��4�� ����11:32:17
 * 
 *        Pro 3.2 ��ӡ����
 */

public class PrintLingXing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch = (char) in.nextLine().charAt(0);
		System.out.printf("  %c\n", ch);
		System.out.printf(" %c%c%c\n", ch, ch, ch);
		System.out.printf("%c%c%c%c%c\n", ch, ch, ch, ch, ch);
		System.out.printf(" %c%c%c\n", ch, ch, ch);
		System.out.printf("  %c\n", ch);
		in.close();
	}

}
