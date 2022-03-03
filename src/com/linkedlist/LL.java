package com.linkedlist;

public class LL {

	/**
	 * Simple Linked List Implementation
	 * created simple linked list
	 * Assigning value to the nodes
	 * display nodes
	 * 
	 */
	public static void main(String[] args) {
		
		/**
		 * 1.created simple linked list
		 * 2.assigning values to nodes
		 */ 
		
		Node head=new Node(56);
		Node second=new Node(30);
		Node third=new Node(70);
		
		head.next=second;
		second.next=third;
		third.next=null;
		/**
		 * Displaying nodes
		 */
		System.out.println(head.data+" "+second.data+" "+third.data);
	}
}
