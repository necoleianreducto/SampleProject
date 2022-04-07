package com.sampleproject.sampleproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleprojectApplicationTests {

	@Test
	void given100ShouldReturnFalse() {
		assertFalse(SampleprojectApplication.isArmStrongNumber(100));;
	}

	@Test
	void given1ShouldReturnTrue() {
		assertTrue(SampleprojectApplication.isArmStrongNumber(1));
	}

	@Test
	void givenOneAndTwoShouldReturnThree() {
		assertEquals(3,SampleprojectApplication.addNumber(1,2));
	}

	@Test
	void givenTwoAndTwoShouldReturnFour() {
		assertEquals(4,SampleprojectApplication.addNumber(2,2));
	}

	@Test
	void testArmstrongNumberFalse1() {
		assertFalse(SampleprojectApplication.isArmStrongNumber(4));
	}

}
