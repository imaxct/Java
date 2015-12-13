package chapter9.linked_listnode_rewritten;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年12月7日 下午9:16:52
 * 
 *        双向链表节点
 */

public class DoubleLinkedListNode {
	private String data;
	private DoubleLinkedListNode prev;
	private DoubleLinkedListNode succ;

	public DoubleLinkedListNode() {
		data = null;
		prev = null;
		succ = null;
	}
	
	public DoubleLinkedListNode(String data){
		this.data = data;
		prev = null;
		succ = null;
	}

	public DoubleLinkedListNode(String data, DoubleLinkedListNode prev, DoubleLinkedListNode succ) {
		this.data = data;
		this.prev = prev;
		this.succ = succ;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DoubleLinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleLinkedListNode prev) {
		this.prev = prev;
	}

	public DoubleLinkedListNode getSucc() {
		return succ;
	}

	public void setSucc(DoubleLinkedListNode succ) {
		this.succ = succ;
	}

}
