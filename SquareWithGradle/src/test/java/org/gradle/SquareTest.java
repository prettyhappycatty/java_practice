package org.gradle;
import junit.framework.TestCase;


public class SquareTest extends TestCase {

	public SquareTest(String name) {
		super(name);
	}
	
	public void testSquare() {
		assertEquals(100, Square.square(10));
	}
	

}
