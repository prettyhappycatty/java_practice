import junit.framework.TestCase;


public class SquareTest extends TestCase {

	public SquareTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSquare() {
		assertEquals(100, Square.square(10));
	}
	

}
