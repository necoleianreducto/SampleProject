package com.sampleproject.sampleproject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleprojectApplicationTests {

	@Test
	void testArmstrongNumberFalse() {
		assertFalse(SampleprojectApplication.isArmStrongNumber(100));
	}

	@Test
	void testArmstrongNumberTrue() {
		assertTrue(SampleprojectApplication.isArmStrongNumber(153));
	}

}
