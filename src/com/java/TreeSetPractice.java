package com.java;

import java.util.Set;
import java.util.TreeSet;

class Orange implements Comparable<Orange>
{
	int wt;
	
	public Orange(int wt) {
		this.wt = wt;
	}

	@Override
	public int compareTo(Orange o) {
		// TODO Auto-generated method stub
		return this.wt-o.wt;
	}
	
	public String toString() {
		return Integer.toString(this.wt);
	}
}

public class TreeSetPractice {

	public static void main(String[] args) {
		
		Set s1= new TreeSet<>();
		s1.add(new Orange(200));
		s1.add(new Orange(500));
		s1.add(new Orange(100));
		
		System.out.println(s1);
	}

}
