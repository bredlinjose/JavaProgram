package training;

import java.util.Collections;
import java.util.LinkedList;

public class Pen {
	int id;
	String name;
	
	public Pen(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//for wrapper data no need of overriding toString()
	//without overriding also we will get the data
	@Override
	public String toString() {
		return "Pen [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		LinkedList<Pen> l = new LinkedList<Pen>();
		l.add(new Pen(9, "Cello"));
		l.add(new Pen(5, "Butterflow"));
		l.add(new Pen(3, "Linc"));
		l.add(new Pen(8, "Cello"));
		//Collections.sort(l, new SortById());
		for (Pen pen : l) {
			System.out.println(pen);
		}

	}


}
