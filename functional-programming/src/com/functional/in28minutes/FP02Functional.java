package com.functional.in28minutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
	private List<String> courses = Arrays.asList("spring core", "springBoot", "AWS", "Docker", "Kuberneties",
			"salesForce", "React", "Angular", "javaScript", "Java spring");
	private List<Integer> numbers = (Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5));
	private List<Integer> squaresOfNumbers;

	public FP02Functional() {
		squaresOfNumbers = new ArrayList<Integer>();
	}

	public static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

	public void addTheListElements() {
		System.out.println(numbers.stream().reduce(0, (x, y) -> x));
		System.out.println(numbers.stream().reduce(0, Integer::sum));
		System.out.println(numbers.stream().reduce(0, FP02Functional::sum));
	}

	public void useDistinctMethod() {
		numbers.stream().distinct().forEach(System.out::println);
		courses.stream().distinct().forEach(System.out::println);
	}

	public void useSorterdMethod() {
		numbers.stream().sorted().forEach(System.out::println);
		courses.stream().map(num -> num.toLowerCase()).sorted().forEach(System.out::println);

	}

	public void useBothDistinctAndSortMethods() {
		numbers.stream().distinct().sorted().forEach(System.out::println);
	}

	public void comparatorToSort() {
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		numbers.stream().sorted(Comparator.comparingInt(n -> ((Integer) n).intValue()).reversed())
				.forEach(System.out::println);
	}

	public void setSquaredNumbersToNewList() {
		squaresOfNumbers = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		// creating the new list with only even numbers
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		evenNumbersList = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbersList);

		System.out.println(squaresOfNumbers);
	}

	public void createAnArrayOfListWithLenghtsOfTheCourses() {
		List<Integer> courseLengthList = new ArrayList<Integer>();
		courseLengthList = courses.stream().map(len -> len.length()).collect(Collectors.toList());
		System.out.println(courseLengthList);
	}

	public static void main(String[] args) {
		FP02Functional obj = new FP02Functional();
//		obj.addTheListElements();
//		obj.useDistinctMethod();
//		obj.useSorterdMethod();
//		obj.useBothDistinctAndSortMethods();
//		obj.comparatorToSort();
//		obj.setSquaredNumbersToNewList();
		obj.createAnArrayOfListWithLenghtsOfTheCourses();
	}

}
