package pk;


public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int expected = 10;
		int actual = c.add(3, 7);
		System.out.println(actual);
	}
}
