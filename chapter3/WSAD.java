package chapter3;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015��11��5�� ����1:29:47
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
				System.out.println("ǰ");
				break;
			case 'A':
			case 'a':
				System.out.println("��");
				break;
			case 'S':
			case 's':
				System.out.println("��");
				break;
			case 'D':
			case 'd':
				System.out.println("��");
				break;
			default:
				System.out.println("Wrong");
				break;
			}
		}
		in.close();

	}

}
