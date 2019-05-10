package com.datastructures.com;

public class LinkedList {

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

		public void displayNode() {
			System.out.println("item: " + data);
		}
	}

	Node head = null;

	void insertion(int i) {
		Node newN = new Node(i);

		newN.next = head;
		head = newN;

	}

	// delete by Key
	void deletion(int key) {
		Node prev = head;
		if (head == null)
			return;
		if (key == 0) {
			head = head.next;
			return;
		}
		for (int i = 0; head != null && i < key - 1; i++)
			head = head.next;
		Node next = head.next.next;
		head.next = next;

		System.out.println("deleted element: " + key);
	}

	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.insertion(10);
		LL.insertion(30);
		LL.insertion(13);
		LL.insertion(14);
		LL.printall();
		LL.deletion(1);
		LL.printall();

	}

	private void printall() {
		Node current = head;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}

	}

}
