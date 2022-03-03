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
		 * PROCEDURE 1.Adding values to nodes 2. Inserting data to linkedList 3. pop
		 * data at first node to linkedList 4. Printing linedList nodes 5. pop data at
		 * lastnode to linkedList 6. Printing linedList nodes 7. Appending data to
		 * linkedList
		 */
		LL list = new LL();
		/**
		 *
		 * 1.Adding values to nodes
		 */
		list.add(70);
		list.add(56);
		/**
		 * 2. Inserting data to linkedList
		 */
		list.insert(list.head, 30);
		System.out.println("Before poping data:");
		list.printLL();
		System.out.println();
		/**
		 * 3. pop data at first node to linkedList
		 */
		list.popAtFirst();
		System.out.println("After poping First data:");
		/**
		 * 4. Printing linkedList nodes
		 */
		list.printLL();
		System.out.println();
		/**
		 * Doing pop at last node
		 */
		list.add(56);
		System.out.println("Before poping data:");
		list.printLL();
		System.out.println();
		/**
		 * 5. pop data at lastnode to linkedList
		 */
		list.popAtLast(70);
		System.out.println("After poping Last data:");
		/**
		 * 6. Printing linkedList nodes
		 */
		list.printLL();
		System.out.println();
		/**
		 * 7. Appending data to linkedList
		 */
		list.append(56);
		list.append(30);
		list.append(70);

	}
}
