package com.assignment.java;

import java.util.LinkedHashSet;

public class OccuranceOfEachNumWithoutDuplicate {

	public static void main(String[] args) {
		int[] a= {4,1,4,2,0,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
		}
		for (Integer integer : set) {
			for (int i = 0; i < a.length; i++) {
				if(integer==a[i]) {
					System.out.println(integer+" is in "+(i+1)+" position");
					break;
				}
			}
			
		}

	}

}
