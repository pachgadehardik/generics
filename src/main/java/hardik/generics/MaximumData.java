package hardik.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumData {

	//Generic Method With multiple Types input 
	public static <T extends Comparable<T>> T getMaximum(T arr[]) {

		// Assuming First Element is Maximum
		T maxElement = arr[0];
		return Arrays.stream(arr).collect(Collectors.maxBy(T::compareTo)).get();

	}

}
