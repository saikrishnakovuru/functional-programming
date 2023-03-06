package com.functional.in28minutes;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		printNumbersInListStructured(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

	private static void printNumbersInListStructured(List<Integer> nums) {
		for (int val : nums) {
			System.out.println(val);
		}
	}
}
