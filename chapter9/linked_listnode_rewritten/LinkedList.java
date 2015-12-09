package chapter9.linked_listnode_rewritten;

/**
 * @author Max_CT(imaxct)
 *
 * @since 2015��12��7�� ����6:06:28
 * 
 *        ��д������
 * 
 * @see head����ͷ���,���洢����
 */

public class LinkedList {
	private ListNode head;
	private int length;

	public LinkedList() {
		head = new ListNode(null, null);
		length = 0;
	}

	public void test() {
		this.swap(head.getSucc(), head.getSucc().getSucc());
	}

	/* ���� */
	public void sort() {
		if (length == 1) {
			return;
		} else {
			ListNode i = head.getSucc();
			while (i != null) {
				ListNode j = i.getSucc();
				while (j != null) {
					if (!comp(i, j)) {
						this.swapValue(i, j);
					}
					j = j.getSucc();
				}
				i = i.getSucc();
			}
		}
	}

	private void swapValue(ListNode a, ListNode b) {
		if (a.getData().equals(b.getData())) {
			return;
		}

		String tmp = a.getData();
		a.setData(b.getData());
		b.setData(tmp);
	}

	private boolean comp(ListNode x, ListNode y) {
		int len = Math.min(x.getData().length(), y.getData().length());
		for (int i = 0; i < len; i++) {
			if (x.getData().charAt(i) != y.getData().charAt(i)) {
				return x.getData().charAt(i) < y.getData().charAt(i);
			}
		}
		return x.getData().length() < y.getData().length();
	}

	/* ��������Ԫ�� */
	public void swap(ListNode a, ListNode b) {
		if (a == b)
			return;
		if (a.getSucc() == b) {
			ListNode tmp = a;
			ListNode nextB = b.getSucc();
			ListNode prevA = this.getPrev(a);
			a = b;
			b = tmp;
			prevA.setSucc(a);
			a.setSucc(b);
			b.setSucc(nextB);
			/*
			 * ListNode tmp = b.getSucc(); ListNode prevA = this.getPrev(a);
			 * b.setSucc(a); prevA.setSucc(b); a.setSucc(tmp);
			 */
		} else if (b.getSucc() == a) {
			ListNode tmp = b;
			ListNode nextA = a.getSucc();
			ListNode prevB = this.getPrev(b);
			b = a;
			a = tmp;
			prevB.setSucc(b);
			b.setSucc(a);
			a.setSucc(nextA);

			/*
			 * ListNode tmp = a.getSucc(); ListNode prevB = this.getPrev(b);
			 * a.setSucc(b); prevB.setSucc(a); b.setSucc(tmp);
			 */
		} else {
			ListNode tmp = a;
			ListNode prevA = this.getPrev(a);
			ListNode prevB = this.getPrev(b);
			ListNode nextA = a.getSucc();
			ListNode nextB = b.getSucc();
			a = b;
			b = tmp;
			prevA.setSucc(a);
			prevB.setSucc(b);
			a.setSucc(nextA);
			b.setSucc(nextB);

			/*
			 * ListNode prevA = this.getPrev(a); ListNode prevB =
			 * this.getPrev(b); ListNode tmpA = a.getSucc(); ListNode tmpB =
			 * b.getSucc(); prevA.setSucc(b); b.setSucc(tmpA); prevB.setSucc(a);
			 * a.setSucc(tmpB);
			 */
		}
	}

	/* ��ȡǰһ��Node */
	private ListNode getPrev(ListNode tar) {
		ListNode pos = head;
		while (pos != null) {
			if (pos.getSucc() == tar)
				break;
			pos = pos.getSucc();
		}
		return pos;
	}

	/* ��After!��After!��After!����To */
	public void addNodeAfterHead(String data) {
		head.setSucc(new ListNode(data, head.getSucc()));
		length++;
	}

	public void addNodeToTail(String data) {
		if (length == 0) {
			this.addNodeAfterHead(data);
		} else {
			length++;
			ListNode position = head.getSucc();
			ListNode current = null;
			while (position != null) {
				current = position;
				position = position.getSucc();
			}
			current.setSucc(new ListNode(data, null));
		}
	}

	public int getLength() {
		return length;
	}

	public void deleteFirstNode() {
		if (length == 0) {
			System.out.println("Error:Empty List >_< ~");
		} else {
			head.setSucc(head.getSucc().getSucc());
			length--;
		}
	}

	public void deleteNodeAtTail() {
		if (length == 0) {
			System.out.println("Error:Empty List >_< ~");
		} else {
			length--;
			ListNode position = head.getSucc();
			ListNode current = null;
			while (position != null) {
				current = position;
				position = position.getSucc();
			}
			current.setSucc(null);
		}
	}

	public void showList() {
		if (length == 0) {
			System.out.println("Empty LinkedList >_< ~");
		} else {
			ListNode pos = head.getSucc();
			System.out.print("Total: " + length + ":[head -> ");
			while (pos != null) {
				System.out.print(pos.getData() + " -> ");
				pos = pos.getSucc();
			}
			System.out.println("null]");
		}
	}
}
