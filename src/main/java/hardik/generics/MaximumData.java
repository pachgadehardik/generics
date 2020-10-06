package hardik.generics;

import java.util.stream.Stream;

public class MaximumData {

	
	public int getMaximum(Integer arr[]) {
		
		return Stream.of(arr).max(Integer::compareTo).get();
	}
	
	
	public float getMaximum(Float arr[]) {
		
		return Stream.of(arr).max(Float::compareTo).get();
		
	}
	
}
