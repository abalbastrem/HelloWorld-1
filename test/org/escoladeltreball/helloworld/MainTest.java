/**
 * 
 */
package org.escoladeltreball.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author jmendez
 *
 */
public class MainTest {

	private static Main main;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in setUpBeforeClass method");
		main = new Main();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass method");
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown method");
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#findSmallest(int[])}.
	 */
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] { 1, 2, 3 }));
		assertEquals(0, main.findSmallest(new int[] { 4, 0, 1, 2, 3 }));
		assertEquals(-2, main.findSmallest(new int[] { 1, -2, 3 }));
		assertEquals(3, main.findSmallest(new int[] { 3 }));
		assertEquals(1, main.findSmallest(new int[] { 1, 1, 1 }));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#sum(int[])}.
	 */
	@Ignore("El tractarem més tard")
	@Test
	public final void testSum() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#frequency(int[], int)}.
	 */
	@Ignore("El tractarem més tard")
	@Test
	public final void testFrequency() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
	//@Ignore("El tractarem més tard")
	@Test
	public final void testFrequencyPercentage() {
		int[] values = {3,4,3,5,1,2,3,0};
		assertEquals(37.5, main.frequencyPercentage(values, 3),1e-4);
	}
	
	/**
	 * Test method for
	 * {@link org.escoladeltreball.helloworld.Main#isPresent(int[], int)}.
	 */
	//@Ignore("El tractarem més tard")
	@Test
	public final void testIsPresent() {
		int[] values = {3,4,3,5,1,2,3,0};
		assertEquals(true, main.isPresent(values, 3));
		assertEquals(false, main.isPresent(values, 6));
		
	}

}
