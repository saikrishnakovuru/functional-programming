package com.zjava8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {

	private void consumerAndForEach() {
		List<Integer> intList = Arrays.asList(1, 5, 6, 8, 3, 4);

		Consumer<Integer> cons = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};

		intList.forEach(cons);

		// all the lines from 10 to 19 can be removes and replaced as below
		intList.forEach(num -> System.out.println("Num in list" + num));
	}

	private void simpleForEach() {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(48);

		list.stream().forEach(System.out::println);
	}

	public static void main(String[] args) {

		ForEachTest test = new ForEachTest();
		test.consumerAndForEach();
		test.simpleForEach();

	}
}
