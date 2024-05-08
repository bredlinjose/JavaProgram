package dsa.linkedlist;

import java.util.Iterator;

public class MethodCalling {
	
	public static void normalCall() {
		LinkedList_int list = new LinkedList_int();
		
		list.insertAtBeginning(10);
		list.display();
		
		list.insertAtBeginning(20);
		list.display();
		
		list.insertAtBeginning(30);
		list.display();
		
		list.insertAtPosition(1, 100);
		list.display();
		
		list.deleteAtPosition(0);
		list.display();
		
		list.deleteAtBeginning();
		list.display();
		
	}
	
	public static void genericCall() {
		LinkedList<Integer> integer = new LinkedList<Integer>();
		
		integer.insertAtBeginning(10);
		integer.display();
		
		integer.insertAtBeginning(20);
		integer.display();
		
		integer.insertAtBeginning(30);
		integer.display();
		
		integer.insertAtPosition(1, 100);
		integer.display();
		
		integer.reverse();
		integer.display();
		
		integer.deleteAtPosition(0);
		integer.display();
		
		integer.deleteAtBeginning();
		integer.display();
		
		
		
		LinkedList<String> string = new LinkedList<String>();
		string.insertAtBeginning("bredlin");
		string.display();
		
		string.insertAtBeginning("jose");
		string.display();
		
		string.insertAtBeginning("jovelin");
		string.display();
		
		string.insertAtPosition(1, "noah");
		string.display();
		
		string.deleteAtPosition(0);
		string.display();
		
		string.deleteAtBeginning();
		string.display();
		
		
		
		for (int number:integer) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		Iterator<Integer> it = integer.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() +" ");
		}
	}

	public static void main(String[] args) {
		normalCall();
		System.out.println("============================");
		genericCall();

	}

}
