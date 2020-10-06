package hardik.generics;

public class GenericClass<T extends Comparable<T>> {

	T v1;
	T v2;
	T v3;

	public GenericClass(T v1, T v2, T v3) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public T testMaximum() {
		return GenericClass.testMaximum(v1, v2, v3);
	}

	public static <T extends Comparable<T>> T testMaximum(T v1, T v2, T v3) {
		T maxValued = v1;
		if (v2.compareTo(maxValued) > 0)
			maxValued = v2;
		if (v3.compareTo(maxValued) > 0)
			maxValued = v3;
		return maxValued;
	}
}
