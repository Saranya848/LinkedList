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
		 * PROCEDURE 1.Adding values to nodes 2. Inserting data to linkedList 3.
		 * Printing data after inserting of LL 4. pop data at first node to linkedList
		 * 5. pop data at lastnode to linkedList 6. Searching node in LL 7. Appending
		 * data to linkedList
		 */
		LL list = new LL();

		/**
		 *
		 * 1.Adding values to nodes
		 */
		list.add(70);
		list.add(56);
		System.out.println("Before data:");
		list.printLL();
		System.out.println();

		/**
		 * 2. Inserting data to linkedList
		 */
		list.insert(list.head, 40);
		list.insert(list.head, 30);

		/**
		 * 3. Printing data after inserting of LL
		 */
		System.out.println("After insert data:");
		list.printLL();
		System.out.println();

		/**
		 * Doing pop at key node
		 */
		/**
		 * 4. pop data in linkedList
		 */
		list.pop(40);

		/**
		 * Sorting data in LL
		 */
		list.sort();
		/**
		 * Printing data after deleting of LL
		 */
		System.out.println("After data:");
		list.printLL();
		System.out.println();

		/**
		 * 5. pop data at first node to linkedList
		 */
		list.popAtFirst();

		/**
		 * 6. Searching node in LL
		 */
		list.search(list.head, 30);
		list.search(list.head, 70);

		/**
		 * 7. Appending data to linkedList
		 */
		list.append(56);
		list.append(30);
		list.append(70);

	}
}
