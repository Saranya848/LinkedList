package com.linkedlist;

public class LL {

	/**
	 * Simple Linked List Implementation 1.created simple linked list 2.Assigning
	 * value to the nodes display nodes
	 * 
	 */
	public static void main(String[] args) {

		/**
		 * 1.created simple linked list 2.assigning values to nodes
		 */

		Node head = new Node(70);
		Node second = new Node(30);
		Node third = new Node(56);

		head.next = second;
		second.next = third;
		third.next = null;
		/**
		 * Displaying nodes
		 */
		System.out.println(third.data + " " + second.data + " " + head.data);
	}
}
