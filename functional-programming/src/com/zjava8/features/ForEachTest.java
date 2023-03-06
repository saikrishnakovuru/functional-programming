package com.zjava8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 5, 6, 8, 3, 4);

		Consumer<Integer> cons = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};

		intList.forEach(cons);

		intList.forEach(num -> System.out.println("Num in list" + num));
	}
}
