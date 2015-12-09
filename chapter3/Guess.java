package chapter3;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月5日 下午1:33:53
 * 
 *        Pro 3.2
 */

public class Guess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = (int) (Math.random() * 1000) + 1;
		int userinput = 0;

		System.out.println("Input an integer between 1 and 1000:");

		userinput = in.nextInt();

		while (userinput != num) {
			if (userinput > num)
				System.out.println("It's too big, try again:");
			else
				System.out.println("It's too small, try again:");
			userinput = in.nextInt();
		}

		System.out.println("You win!");

		in.close();

	}

}
