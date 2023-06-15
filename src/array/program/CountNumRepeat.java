package array.program;

import java.util.LinkedHashSet;

public class CountNumRepeat {

	public static void main(String[] args) {
		int[] a= {4,1,4,2,0,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
		}
		for (Integer integer : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(integer==a[i]) {
					count++;
				}
			}
			System.out.println(integer+" is repeating "+count+" times");
		}
	}

}
