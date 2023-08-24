package com;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)

public class calculatorTest {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All --");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each -- ");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After Each -- ");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("After All --");
	}
	@Test
	@DisplayName("Adding 3 and 7")
	@Order(1)
	public void testAdd() {
		calculator c = new calculator();
		int expected = 10;
		int actual = c.add(3, 7);
		assertEquals(expected,actual);
		System.out.println("Test Case 1 --");
		c = null;
	}
	
	@Test
	@DisplayName("Adding 5 and 5")
	@Order(2)
	public void testAdd2() {
		calculator c = new calculator();
		int expected = 10;
		int actual = c.add(5, 5);
		assertEquals(expected,actual);
		System.out.println("Test Case 2 --");
		c = null;
	}
	@Test
	@DisplayName("Adding 1 and 9")
	@Order(3)
	public void testAdd3() {
		calculator c = new calculator();
		int expected = 10;
		int actual = c.add(1, 9);
		assertEquals(expected,actual);
		System.out.println("Test Case 3 --");
		c = null;
	}
}
