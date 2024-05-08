package dsa.linkedlist;

public class LinkedList_int {
	private Node head;

	class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	public LinkedList_int() {
		head = null;
	}

	public void insertAtBeginning(int value) {
		Node newNode = new Node(value);

		if (head == null) { // when list is empty
			head = newNode;
		} else { // when list is not empty
			newNode.next = head;
			head = newNode;
		}

	}

	public void display() {
		Node temp = head; // start from head
		while (temp != null) { // null end of the list
			System.out.print(temp.data + " ");
			temp = temp.next; // jump
		}
		System.out.println();
	}

	public void insertAtPosition(int position, int value) {
		if (position == 0) {
			insertAtBeginning(value);
			return;
		}

		Node newNode = new Node(value);
		Node temp = head;

		for (int i = 1; i < position; i++) { // jump to prev node
			temp = temp.next;
			if (temp == null) { // Invalid position
				throw new IllegalArgumentException("Invalid Position " + position);
			}

		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void deleteAtPosition(int position) {
		if (head == null) { // when the list is empty
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
		if (temp == null) { // when the position is invalid
			throw new IndexOutOfBoundsException("Deletion attempted on Invalid position");
		}
		prev.next = temp.next; // reassign pointer

	}

	public void deleteAtBeginning() {
		if (head == null) { // when the list is empty
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		head = head.next;
	}

}
