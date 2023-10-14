package training;

import java.util.Comparator;

public class SortById implements Comparable<Pen>{

	@Override
	public int compareTo(Pen o1, Pen o2) {
		
		return o1.id-o2.id;
	}

}
