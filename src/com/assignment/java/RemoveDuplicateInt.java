package com.assignment.java;

import java.util.LinkedHashSet;

public class RemoveDuplicateInt {

	public static void main(String[] args) {
		int[] a= {4,1,4,2,0,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
		}
		//System.out.println(set);
		for (Integer integer : set) {
			System.out.print(integer+" ");
			
		}
	}

}
