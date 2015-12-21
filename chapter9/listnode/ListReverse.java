package chapter9.listnode;

/**
 * @author Max_CT(imaxct)
 *
 *         2015年12月20日 下午6:01:17
 */

public class ListReverse {

	public static void main(String args[]) {
		String[] testArr = { "abcd", "bcd", "eee", "aacd", "bcd", "eee", "ddd", "bcd", "111", "111" };

		StringLinkedList list = new StringLinkedList();

		for (int i = 0; i < testArr.length; i++) {
			list.AddNodeAtTail(testArr[i]);
		}
		list.showList();
		System.out.println("----------------------------------");

		list.reverse();
		list.showList();
	}
}
