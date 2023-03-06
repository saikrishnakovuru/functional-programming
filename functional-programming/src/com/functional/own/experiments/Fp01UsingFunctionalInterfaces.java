package com.functional.own.experiments;

import java.util.Arrays;
import java.util.List;

public class Fp01UsingFunctionalInterfaces {
	private List<Integer> numbers = (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

	public void filterEvenNumbers() {
		Fp01isEvenI isEven = n -> n % 2 == 0;
		Fp01SysOut<Integer> printStatement = x -> System.out.println(x);

		numbers.stream().filter(n -> isEven.isEven(n)).forEach(value -> printStatement.print(value));

	}

	public void addAllTheIntegers() {
//		Fp01AddI addition = (a, b) -> a + b;

//		int sum = numbers.stream().reduce(0, (a, b) -> addition.add(a, b));
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Fp01UsingFunctionalInterfaces fp = new Fp01UsingFunctionalInterfaces();
//		fp.filterEvenNumbers();
		fp.addAllTheIntegers();
	}
}
