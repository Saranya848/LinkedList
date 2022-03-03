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
		 * PROCEDURE 1.Adding values to nodes and Inserting data to linkedList 2.
		 * Printing linedList nodes 3. Appending data to linkedList 4. Printing
		 * linedList after adding nodes
		 */
		LL list = new LL();
		/**
		 *
		 * 1.Adding values to nodes and Inserting data to linkedList
		 */
		list.add(70);
		list.add(56);
		list.insert(list.head, 30);

		/**
		 * 2. Printing linedList after adding nodes
		 */
		System.out.println("Adding data:");
		list.printLL();
		System.out.println();
		/**
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
