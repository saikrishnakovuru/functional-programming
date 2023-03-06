package com.functional.own.experiments;

import java.util.Arrays;
import java.util.List;

public class TestSop {
	private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	private void asdf() {
		Fp01SysOut<String> sys = value -> System.out.println(value);
		sys.print("test string");
	}

	private void testBoolean() {
		Fp01SysOut<Boolean> sys = value -> System.out.println(value);
		Fp01isEvenI even = num -> num % 2 == 0;
		Boolean bool = Boolean.valueOf(even.isEven(10));
		sys.print(bool);
	}

	public static void main(String[] args) {
		TestSop sop = new TestSop();
		sop.asdf();
		sop.testBoolean();
	}
}
