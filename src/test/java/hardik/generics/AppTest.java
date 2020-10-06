package hardik.generics;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//   

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

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
}
