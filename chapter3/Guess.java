package chapter3;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015-12-12 15:10
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

		int turn = 0;
		String command = "yes";
		String confirm;
		do {
			turn++;
			int num = (int) (Math.random() * 1000) + 1;
			int userinput = 0;
			System.out.println("============= Round " + turn + " ===============");
			System.out.println("Input an integer between 1 and 1000:");

			userinput = in.nextInt();

			int guesed = 0;
			while (userinput != num) {
				guesed++;
				if (userinput > num)
					System.out.println("It's too big, try again:");
				else
					System.out.println("It's too small, try again:");
				userinput = in.nextInt();
			}
			System.out.println("You win! Tried " + guesed + " times");
			System.out.print("Play again?(yes/no)");
			confirm = in.next();
		} while (confirm.equalsIgnoreCase(command));
		in.close();
	}

}
