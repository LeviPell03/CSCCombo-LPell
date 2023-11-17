import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {
	
	Calculator calc;
	
	@BeforeEach
	void setup() {
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("Simple multiply")
	void testMultiply() {
		assertEquals(calc.multiply(4, 3), 12, "Multiplication does not work");
		assertTrue(calc.multiply(2, 3) == 6, "Multiply 3 and 6 no worky!");
	}
	
	@Test
	@DisplayName("Simple add")
	void testAdd() {
		assertTrue(calc.add(3, 4) == 7, "Add does not work!");
	}
	
	@Test
	@Disabled("Simple division is not ready")
	void testDivision() {
		assertEquals(calc.divide(4, 3), 1, "Divide does not work");
	}
}
