package hardik.generics;

//import junit.framework.Test;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}


	MaximumData obj;

	@Before
	public void init() {
		obj = new MaximumData();
	}

	// Test Case 1.1
	@Test
	public void givenMaxNumberAt1st_ShouldGiveSameNumber() {
		Integer arr[] = new Integer[] { 12, 9, 3 };
		assertEquals(12, obj.getMaximum(arr));
	}

	// TestCase1.2
	@Test
	public void givenMaxNumberAt2nd_ShouldGiveSameNumber() {
		Integer arr[] = new Integer[] { 10, 1000, 123 };
		assertEquals(1000, obj.getMaximum(arr));
	}

	// TestCase1.3
	@Test
	public void givenMaxNumberAt3rd_ShouldGiveSameNumber() {
		Integer arr[] = new Integer[] { 10, 1000, 7895 };
		assertEquals(1000, obj.getMaximum(arr));
	}
	
	
	// Test Case 1.1
		@Test
		public void givenMaxFloatAt1st_ShouldGiveSameNumber() {
			Float arr[] = new Float[] { 19.21f, -12.21f, 0f };
			assertEquals(19.21f, obj.getMaximum(arr));
		}

		// TestCase1.2
		@Test
		public void givenMaxFloatAt2nd_ShouldGiveSameNumber() {
			Float arr[] = new Float[] { 19.21f, 212.21f, 12.1f };
			assertEquals(212.21f, obj.getMaximum(arr));
		}

		// TestCase1.3
		@Test
		public void givenMaxFloatAt3rd_ShouldGiveSameNumber() {
			Float arr[] = new Float[] { -19.21f, -12.21f, 0f };
			assertEquals(0f, obj.getMaximum(arr));
		}
	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
}
