package chapter9.listnode;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月21日 下午12:15:23
 * 
 *        Pro 3.1 找所有相同的值的节点
 */

public class LinkedListFindSameNode {
	static final int MOD = 0x3f3f3f;

	/* 求哈希值 */
	static int mod(String str) {
		int b = 0;
		for (int i = 0; i < str.length(); i++)
			b = (b * 233 + str.codePointAt(i)) % LinkedListFindSameNode.MOD;
		return b;
	}

	/* 哈希表，用来判重 */
	static int[] hash = new int[MOD];

	public static void main(String[] args) {
		String[] testArr = { "abcd", "bcd", "eee", "aacd", "bcd", "eee", "ddd", "bcd", "111", "111" };

		StringLinkedList list = new StringLinkedList();

		for (int i = 0; i < testArr.length; i++) {
			list.AddNodeAtTail(testArr[i]);
		}

		for (int i = 0; i < testArr.length; i++)
			if (hash[mod(testArr[i])] <= 0) { /*只有hash值为0时才会处理，因为hash值大于0的都已经被统计过了*/
				int count = list.findSameValue(testArr[i]);
				if (count > 1) {
					hash[mod(testArr[i])]++;
					System.out.println("There are " + count + " \"" + testArr[i] + "\"");
				}
			}
	}

}
