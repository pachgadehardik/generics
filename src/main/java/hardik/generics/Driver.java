package hardik.generics;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class Driver {
	public static void main(String[] args) {
		
		Integer arr[] = new Integer[] { 10,123,11 };
		Float arr1[] = new Float[] { 10.12f, 98.124f, -123.222f };
		String arr2[] = new String[] { "Apple", "Peach", "Banana" };
		
		System.out.println(MaximumData.getMaximum(arr2));
	}
}
