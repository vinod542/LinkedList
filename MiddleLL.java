package com.datastructures.com;

public class MiddleLL {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public void printmiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				slow_ptr = slow_ptr.next;
				fast_ptr = fast_ptr.next.next;
			}
			System.out.println("Middle Element:" + slow_ptr.data);
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printlist() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "-->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public void nthnode(int n) {
		int len = 0;
		Node temp = head;

		// count number of nodes in linked list
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		System.out.println("count of " + len); // count of LL
		if (len < n)
			return;
		temp = head;

		for (int i = 1; i < len - n + 1; i++)
			temp = temp.next;
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		MiddleLL MLL = new MiddleLL();
		MLL.push(32);
		MLL.push(23);
		MLL.push(43);
		MLL.push(4);
		MLL.push(12);
		MLL.push(22);
		MLL.printmiddle();
		MLL.nthnode(3);
		MLL.printlist();
	}

}
