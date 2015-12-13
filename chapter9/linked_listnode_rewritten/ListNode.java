package chapter9.linked_listnode_rewritten;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年12月7日 下午6:02:11
 * 
 *        重写的链表节点...
 */

public class ListNode {
	private String data;
	private ListNode succ;

	public ListNode() {
		data = null;
		succ = null;
	}

	public ListNode(String data, ListNode succ) {
		this.data = data;
		this.succ = succ;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ListNode getSucc() {
		return succ;
	}

	public void setSucc(ListNode succ) {
		this.succ = succ;
	}

}
