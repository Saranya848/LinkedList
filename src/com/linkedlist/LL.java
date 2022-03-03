package com.linkedlist;

public class LL {

	/**
	 * Simple Linked List Implementation 1. method for adding nodes 2.Method for
	 * Appending LL 3.Method for inserting node in LL 4. Method for pop node in LL
	 * 5. Method for print/display LL
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
	}

	/**
	 * 3.Method for inserting node in LL
	 */
	public void insert(Node node, int newdata) {

		if (node == null) {
			System.out.println("The node can't null");
			return;
		}

		Node newnode = new Node(newdata);

		newnode.next = node.next;
		node.next = newnode;
	}

	/**
	 * 4. Method for pop node in LL
	 */
	public int popAtFirst() {
		int popData = 0;
		if (head == null) {
			System.out.println("Stack Over Flow");
		}
		popData = head.data;
		head = head.next;
		return popData;
	}

	/**
	 * 5. Method for print/display LL
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
