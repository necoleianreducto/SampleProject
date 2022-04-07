package com.sampleproject.sampleproject;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.StringJoiner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleprojectApplication {

	public static void main(String[] args) {

	
    }

	protected static boolean isArmStrongNumber(int input) {
		int originalNumber, remainder, result = 0;

        originalNumber = input;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 9;
        }

		return result == input ? true : false;
	}

    protected static int addNumber(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

}
