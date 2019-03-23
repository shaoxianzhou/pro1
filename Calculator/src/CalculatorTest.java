import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator=new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(3);
		assertEquals(7,calculator.getResult());
	}

	@Test
	public void testMultiply() {
		calculator.add(10);
		calculator.multiply(3);
		assertEquals(30,calculator.getResult());
	}

	@Test
	public void testDivide() {
		calculator.add(6);
		calculator.divide(2);
		assertEquals(3,calculator.getResult());

	}

	
}
