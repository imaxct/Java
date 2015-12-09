package chapter9.listnode;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015��11��21�� ����12:15:23
 * 
 *        Pro 3.1 ��������ͬ��ֵ�Ľڵ�
 */

public class LinkedListFindSameNode {
	static final int MOD = 0x3f3f3f;

	/* ���ϣֵ */
	static int mod(String str) {
		int b = 0;
		for (int i = 0; i < str.length(); i++)
			b = (b * 233 + str.codePointAt(i)) % LinkedListFindSameNode.MOD;
		return b;
	}

	/* ��ϣ���������� */
	static int[] hash = new int[MOD];

	public static void main(String[] args) {
		String[] testArr = { "abcd", "bcd", "eee", "aacd", "bcd", "eee", "ddd", "bcd", "111", "111" };

		StringLinkedList list = new StringLinkedList();

		for (int i = 0; i < testArr.length; i++) {
			list.AddNodeAtTail(testArr[i]);
		}

		for (int i = 0; i < testArr.length; i++)
			if (hash[mod(testArr[i])] <= 0) { /*ֻ��hashֵΪ0ʱ�Żᴦ����Ϊhashֵ����0�Ķ��Ѿ���ͳ�ƹ���*/
				int count = list.findSameValue(testArr[i]);
				if (count > 1) {
					hash[mod(testArr[i])]++;
					System.out.println("There are " + count + " \"" + testArr[i] + "\"");
				}
			}
	}

}
