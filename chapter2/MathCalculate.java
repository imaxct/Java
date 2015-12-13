package chapter2;

import java.util.Scanner;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月5日 下午1:04:06
 * 
 *        Pro 3.1 简单的数学运算程序
 */

public class MathCalculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input two integers:");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Input the operator:");
		in.nextLine();
		char op = in.nextLine().charAt(0);
		switch (op) {
		case '+':
			System.out.println("The result is: " + (a + b));
			break;
		case '-':
			System.out.println("The result is: " + (a - b));
			break;
		case '*':
			System.out.println("The result is: " + (a * b));
			break;
		case '/':
			System.out.println("The result is: " + (a / b));
			break;
		default:
			break;
		}
		in.close();
	}

}
