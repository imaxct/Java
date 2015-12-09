package chapter6;

/**
 * @author Max_CT(imaxct)
 *
 * 2015年11月19日 下午10:10:53
 */

import chapter6.MyString;

public class MyStringDemo {

	public static void main(String[] args) {
		try {
			MyString mystr = new MyString("test");
			System.out.println(mystr.equals("test"));
			System.out.println("The length of mystr is: " + mystr.length());
			System.out.println(mystr.subString(3));
			System.out.println(mystr.subString(0, 2));
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
