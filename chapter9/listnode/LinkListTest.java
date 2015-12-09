package chapter9.listnode;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月21日 下午12:11:37
 * 
 *        For test
 */

public class LinkListTest {

	public static void main(String[] args) {
		String[] testArr = { "2", "1", "4", "6" };

		StringLinkedList list = new StringLinkedList();
		
		for (int i = 0; i < testArr.length; i++) {
			list.AddNodeAtTail(testArr[i]);
		}
		list.showList();
		System.out.println("*************************************");
		list.showList();
	}

}
