package com.java;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		SetPractice prac = new SetPractice();
		prac.hashSet();
		System.out.println();
	}

	public void hashSet() {
		System.out.println("-- Hash Set --");
		
		Set set = new HashSet<>();
		set.add(100);
		set.add("Bredlin");
		set.add('e');
		set.add("Who");
		set.add(30);
		set.add('b');
		
		System.out.println(set);
		
		// 
		System.out.println(set.size());
		
		System.out.println(set.contains("Bredlin"));
		
		set.remove('b');
		System.out.println(set);
		
		
		System.out.println(set.hashCode());
		
		set.clear();
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		
	}

	public void linkedHashSet() {
		System.out.println("-- Linked Hash Set --");
	}

	public void treeSet() {
		System.out.println("-- Tree Set --");
	}
}
