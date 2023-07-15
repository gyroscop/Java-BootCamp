package com.dibya.LinkedList;

public class LL {

	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = size;
	}

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}

	public void insertFirst(int val) {

		Node node = new Node(val, head);
		// node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;

	}

	public void display() {
		Node temp = head;

		while (temp != null) {

			System.out.print(temp.value + " --> ");
			temp = temp.next;
		}

		System.out.println(" End ");

	}

}
