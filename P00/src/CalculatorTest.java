import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author 22046133
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testadd() {
//		fail("Not yet implemented");

		int a = 1234;
		int b = 8765;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 9999;
		assertEquals(expected, actual);

	}

	@Test
	public void testsubstract() {
//		fail("Not yet implemented");

		int a = 100;
		int b = 10;

		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);

		int expected = 90;
		assertEquals(expected, actual);

	}

	@Test
	public void testmultiply() {
//		fail("Not yet implemented");

		int a = 5;
		int b = 8;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		int expected = 40;
		assertEquals(expected, actual);

	}

	@Test
	public void testdivide() {
//		fail("Not yet implemented");

		int a = 99;
		int b = 3;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 33;
		assertEquals(expected, actual);

	}

}
