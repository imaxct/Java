package chapter1;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月4日 下午11:49:23
 * 
 *        思考题 4.3 打印菱形,控制行数
 */

public class PrintLingXingPlus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		int cnt = 1, ch = 2;
		Scanner in = new Scanner(System.in);
		System.out.println("Input A Char:");
		char ch2 = (char) in.nextLine().charAt(0);
		System.out.println("Input An odd integer:");
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= Math.abs(n / 2 - i + 1); j++)
				System.out.print(" ");
			if (i > n / 2)
				ch = -2;
			for (int j = 1; j <= cnt; j++)
				System.out.print(ch2);
			cnt += ch;
			System.out.println();
		}
		in.close();
	}

}
