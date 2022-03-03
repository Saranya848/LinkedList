package com.linkedlist;

public class Main {
	/**
	 * Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * PROCEDURE 1. Creating Lined list 2. Adding nodes to linkedList 2. Appending
		 * data to linkedList 3. Printing linedList after adding nodes
		 */

		/**
		 *
		 * 1.Adding values to nodes
		 */
		LL list = new LL();
		list.add(70);
		list.add(30);
		list.add(56);
		/**
		 * 2. Printing linedList after adding nodes
		 */
		System.out.println("Adding data:");
		list.printLL();
		System.out.println();
		/*
		 * 3. Appending data to linkedList
		 */
		System.out.println("Appending data:");
		list.append(56);
		list.append(30);
		list.append(70);
		/**
		 * 4. Printing linedList after appending nodes
		 */
		list.printLL();
		System.out.println();
	}
}
