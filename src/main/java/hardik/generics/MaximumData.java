package hardik.generics;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaximumData {

	// Generic Method With multiple input
	public static <T extends Comparable<T>> T getMaximum(T... arr) {

		return Arrays.stream(arr).sorted().reduce((first,second) -> second).orElse(null);
		
//		return Arrays.stream(arr).collect(Collectors.maxBy(T::compareTo)).get();

	}

	public static <T extends Comparable<T>> void printMaximum(T element){
		System.out.println("Maximum Element is : "+ element);
	}
	
}
