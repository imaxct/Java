package chapter9.linked_listnode_rewritten;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年12月7日 下午6:35:48
 * 
 *        Demo
 */

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		String[] testArr = { "d", "c", "b", "a" , "1"};
		for (int i = 0; i < testArr.length; i++) {
			list.addNodeToTail(testArr[i]);
		}
		list.showList();
		System.out.println("*************************************");
		//list.test();
		list.sort();
		list.showList();
	}

}
