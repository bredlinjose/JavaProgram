package com.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		ListPractice pra = new ListPractice();
		pra.arrayList();
		System.out.println();
		pra.linkedList();
	}

	public void arrayList() {
		System.out.println("-- Array List --");
		List<Integer> list = new ArrayList<Integer>();

		// add element in the list
		list.add(30);
		list.add(15);
		list.add(36);
		list.add(15);
		list.add(45);
		list.add(12);
		list.add(36);
		System.out.println(list);

		// get the element in the particular index
		System.out.println(list.get(4));

		// add element in the particular index
		list.add(2, 55);
		System.out.println(list);

		// update the element in the particular index
		list.set(0, 33);
		System.out.println(list);

		// remove the element in the particular index
		list.remove(0);
		System.out.println(list);

		// get the index of the 1st occurrence of the particular element
		System.out.println("1st occurrence: " + list.indexOf(36));

		// get the index of the last occurrence of the particular element
		System.out.println("last occurrence: " + list.lastIndexOf(36));

		// get the element between the from index and to index
		System.out.println(list.subList(1, 3));

		// returns the number of elements in this list
		System.out.println("Size of the list is " + list.size());

		// returns true if this list contains the specified element
		System.out.println(list.contains(12));

		// remove all the elements from the list
		list.clear();
		System.out.println(list);

		// returns true if the list contains no elements
		System.out.println("List is Empty? " + list.isEmpty());
		
		List l = new ArrayList<>();
		l.add(10);
		l.add("Bredlin");
		l.add(21.6);
		l.add("What");
		l.add('a');
		l.add(true);
		System.out.println(l);
	}

	public void linkedList() {
		System.out.println("-- Linked List --");
		List<Integer> list = new LinkedList<Integer>();

		// add element in the list
		list.add(30);
		list.add(15);
		list.add(36);
		list.add(15);
		list.add(45);
		list.add(12);
		list.add(36);
		System.out.println(list);

		// get the element in the particular index
		System.out.println(list.get(4));

		// add element in the particular index
		list.add(2, 55);
		System.out.println(list);

		// update the element in the particular index
		list.set(0, 33);
		System.out.println(list);

		// remove the element in the particular index
		list.remove(0);
		System.out.println(list);

		// get the index of the 1st occurrence of the particular element
		System.out.println("1st occurrence: " + list.indexOf(36));

		// get the index of the last occurrence of the particular element
		System.out.println("last occurrence: " + list.lastIndexOf(36));

		// get the element between the from index and to index
		System.out.println(list.subList(1, 3));

		// returns the number of elements in this list
		System.out.println("Size of the list is " + list.size());

		// returns true if this list contains the specified element
		System.out.println(list.contains(12));

		// remove all the elements from the list
		list.clear();
		System.out.println(list);

		// returns true if the list contains no elements
		System.out.println("List is Empty? " + list.isEmpty());
		
		List l = new ArrayList<>();
		l.add(10);
		l.add("Bredlin");
		l.add(21.6);
		l.add("What");
		l.add('a');
		l.add(true);	
		System.out.println(l);

	}

}
