package chapter9.linked_listnode_rewritten;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年12月7日 下午9:30:25
 * 
 *        Demo
 */

public class DoubleLinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		String[] testArr = { "d", "c", "b", "a" , "1"};
		for (int i = 0; i < testArr.length; i++) {
			list.addNodeToTail(testArr[i]);
		}
		list.showList();
		System.out.println("**********************************************");
		list.sort();
		list.showList();

	}

}
