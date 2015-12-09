package chapter3;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月5日 下午1:29:47
 * 
 *        Pro 3.1
 */

public class WSAD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input WASD :");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'W':
			case 'w':
				System.out.println("前");
				break;
			case 'A':
			case 'a':
				System.out.println("左");
				break;
			case 'S':
			case 's':
				System.out.println("后");
				break;
			case 'D':
			case 'd':
				System.out.println("右");
				break;
			default:
				System.out.println("Wrong");
				break;
			}
		}
		in.close();

	}

}
