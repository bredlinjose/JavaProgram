package other.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountMinMax {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// count()
		long count = numberList.stream().filter(num -> num%2==0).count();
		System.out.println(count);
		
		// min()
		Optional<Integer> min = numberList.stream().min((val1, val2) ->{
			return val1.compareTo(val2);
		});
		System.out.println(min.get());
		
		// max
		Optional<Integer> max = numberList.stream().max((val1, val2) ->{
			return val1.compareTo(val2);
		});
		System.out.println(max.get());
		
	}

}
