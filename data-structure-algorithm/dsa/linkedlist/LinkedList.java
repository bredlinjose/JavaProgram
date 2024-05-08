package dsa.linkedlist;

import java.util.Iterator;



/**
 * @reference Youtube- Logic First Tamil
 * @param <T>
 */
public class LinkedList<T> implements Iterable<T>{
	private Node head;
	
	class Node {
		T data;
		Node next;
		
		public Node(T value) {
			data= value;
			next = null;
		}
	}
	
	public LinkedList() {
		head=null;
	}

	public void insertAtBeginning(T value) {
		Node newNode = new Node(value);
		
		if (head==null) { // when list is empty
			head = newNode;
		}else { // when list is not empty
			newNode.next= head;
			head = newNode;
		}
		
	}
	
	public void display() {
		Node temp = head;  // start from head
		while (temp!= null) { // null  end of the list
			System.out.print(temp.data + " ");
			temp= temp.next; //jump
		}
		System.out.println();
	}

	public void insertAtPosition(int position, T value) {
		if (position == 0) {
			insertAtBeginning(value);
			return;
		}
		
		Node newNode = new Node(value);
		Node temp = head; 
		
		for (int i = 1; i < position; i++) { // jump to prev node
			temp = temp.next;
			if (temp == null) { // Invalid position
				throw new IllegalArgumentException("Invalid Position "+ position);
			}
			
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void deleteAtPosition(int position) {
		if (head == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		
		if (position == 0) {
			deleteAtBeginning();
			return;
		}
		
		Node temp = head;
		Node prev = null;
		
		for (int i = 1; i <= position; i++) { // jump till node to be delete
			prev = temp; // keep track of prev node
			temp = temp.next; // jump to next node
		}
		prev.next = temp.next; // reassign pointer
	}

	public void deleteAtBeginning() {
		if (head == null) { // when the list is empty
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		head = head.next;
	}

	// only to use for each loop
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node temp = head;

			@Override
			public boolean hasNext() {
				return temp!=null;
			}

			@Override
			public T next() {
				T value = temp.data;
				temp = temp.next;
				return value;
			}
		};
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while (current!=null) {
			next = current.next;
			current.next = prev; // reverse link
			prev = current;
			current = next;
		}
		head = prev;
		
	}
}
