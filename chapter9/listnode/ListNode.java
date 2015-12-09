package chapter9.listnode;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年11月21日 上午11:56:32
 * 
 *        链表节点
 */

public class ListNode {
	private String data;
	private ListNode link;

	public ListNode() {
		link = null;
		data = null;
	}
	
	public ListNode(String newData, ListNode linkValue) {
		data = newData;
		link = linkValue;
	}

	public void setData(String newData) {
		data = newData;
	}

	public String getData() {
		return data;
	}

	public void setLink(ListNode newLink) {
		link = newLink;
	}

	public ListNode getLink() {
		return link;
	}
}