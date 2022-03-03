package com.linkedlist;

public class LL {

	/**
	 * Simple Linked List Implementation 1. method for adding nodes 2.Method for
	 * Appending LL 3. Method for print/display LL 4.Adding values to nodes 5.
	 * Appending data to linkedList 5. Printing linedList after adding nodes
	 */
	Node head;

	/**
	 * 1. method for adding nodes
	 * 
	 * @param data
	 */
	public void add(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}

	/**
	 * 2.Method for Appending LL
	 */
	public void append(int newdata) {

		Node newnode = new Node(newdata);
		if (head == null) {
			head = new Node(newdata);
		}

		newnode.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = newnode;
		return;
	}

	/**
	 * 3.Method for print/display LL
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

}
