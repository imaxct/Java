package chapter2;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月5日 下午1:14:35
 * 
 *        Pro 3.2
 */

public class Unicode {

	public static boolean isNumberic(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(str).matches();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		if (in.hasNextInt()) {
			int code = in.nextInt();
			if (code < 0)
				System.out.println("Wrong");
			else
				System.out.println((char) code);
		} else {
			String tmp = in.next();
			System.out.println(tmp.codePointAt(0));

		}
		/*
		 * String str = in.next(); if (isNumberic(str)){
		 * System.out.println((char)Integer.parseInt(str)); }else{
		 * System.out.println((int)str.charAt(0)); }
		 */
		in.close();
	}

}
