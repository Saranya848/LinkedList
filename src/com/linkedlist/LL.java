package com.linkedlist;

public class LL {

	/**
	 * Simple Linked List Implementation 1. method for adding nodes 2.Method for
	 * print/display LL 3.Adding values to nodes 4. Printing linedList after adding
	 * nodes
	 */
	Node head;

	/**
	 * 1. method for adding nodes
	 * 
	 * @param data
	 */
	public void add(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	/**
	 * 2.Method for print/display LL
	 */
	public void printLL() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}
		}
	}

	public static void main(String[] args) {

		/**
		 *
		 * 3.Adding values to nodes
		 */
		LL list = new LL();
		list.add(70);
		list.add(30);
		list.add(56);
		/**
		 * 4. Printing linedList after adding nodes
		 */
		list.printLL();
		System.out.println();
	}
}

