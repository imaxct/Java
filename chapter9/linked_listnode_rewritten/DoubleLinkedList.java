package chapter9.linked_listnode_rewritten;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015年12月7日 下午9:16:11
 * 
 *        双向链表
 */

public class DoubleLinkedList {
	private int length;
	private DoubleLinkedListNode head;
	private DoubleLinkedListNode tail;

	public DoubleLinkedList() {
		head = new DoubleLinkedListNode();
		tail = new DoubleLinkedListNode();
		head.setSucc(tail);
		tail.setPrev(head);
		length = 0;
	}

	public void sort() {
		if (length == 1){
			return;
		}else{
			DoubleLinkedListNode i = head.getSucc();
			while (i != tail) {
				DoubleLinkedListNode j = i.getSucc();
				while (j != tail) {
					if (!comp(i, j)) {
						this.swapValue(i, j);
					}
					j = j.getSucc();
				}
				i = i.getSucc();
			}
		}
	}

	/*字符串比较*/
	private boolean comp(DoubleLinkedListNode x, DoubleLinkedListNode y) {
		int len = Math.min(x.getData().length(), y.getData().length());
		for (int i = 0; i < len; i++) {
			if (x.getData().charAt(i) != y.getData().charAt(i)) {
				return x.getData().charAt(i) < y.getData().charAt(i);
			}
		}
		return x.getData().length() < y.getData().length();
	}
	
	private void swapValue(DoubleLinkedListNode a, DoubleLinkedListNode b) {
		String temp = a.getData();
		a.setData(b.getData());
		b.setData(temp);
	}

	public void addNodeAfterHead(String data) {
		length++;
		DoubleLinkedListNode pos = head.getSucc();
		DoubleLinkedListNode temp = new DoubleLinkedListNode(data, head, pos);
		pos.setPrev(temp);
		head.setSucc(temp);
	}

	public void addNodeToTail(String data) {
		length++;
		DoubleLinkedListNode pos = tail.getPrev();
		DoubleLinkedListNode temp = new DoubleLinkedListNode(data, pos, tail);
		pos.setSucc(temp);
		tail.setPrev(temp);
	}

	public int getLength() {
		return length;
	}

	public void deleteFirstNode() {
		if (length == 0) {
			System.out.println("Error:Empty List >_< ~");
		} else {
			length--;
			DoubleLinkedListNode pos = head.getSucc().getSucc();
			head.setSucc(pos);
			pos.setPrev(head);
		}
	}

	public void deleteLastNode() {
		if (length == 0) {
			System.out.println("Error:Empty List >_< ~");
		} else {
			length--;
			DoubleLinkedListNode pos = tail.getPrev().getPrev();
			pos.setSucc(tail);
			tail.setPrev(pos);
		}
	}

	public void showList() {
		if (length == 0) {
			System.out.println("Empty LinkedList >_< ~");
		} else {
			DoubleLinkedListNode pos = head.getSucc();
			System.out.print("Total: " + length + ":[ head <-> ");
			while (pos != tail) {
				System.out.print(pos.getData() + " <-> ");
				pos = pos.getSucc();
			}
			System.out.println("tail]");
		}
	}
}
