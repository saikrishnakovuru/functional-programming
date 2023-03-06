package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Sort a list of strings in ascending order.
//Filter out all the even numbers from a list of integers.
//Find the maximum number from a list of integers.
//Convert a list of strings to upperCase.
//Count the number of words in a string.
//Check if a given string is a palindrome.
//Find the sum of all the even numbers from a list of integers.
//Merge two lists of strings and remove duplicates.
//Create a list of all the square roots of numbers from 1 to 10.
//Convert a list of integers to a list of strings.
public class Exercise1 {

	private List<String> listOfStrings = Arrays.asList("z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "c", "b",
			"a");
	private List<Integer> listOfIntegers = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2);
	private String str = "Count the number of words in a string using lambda functions";

	private void sortingStringsInAscendingOrder() {
		listOfStrings.stream().map(num -> num.toLowerCase()).sorted().forEach(System.out::print);
	}

	private void printEvenNumbersFromListOfIntegers() {
		Predicate<? super Integer> predicate = num -> num % 2 == 0;
//		listOfIntegers.stream().filter(num -> even(num));
		listOfIntegers.stream().filter((num) -> {
			return num % 2 == 0;
		}).forEach(System.out::print);
	}

//	private boolean even(int num) {
//		return num % 2 == 0;
//	}

	private void findMaximimNumberFromListOfIntegers() {
		Optional<Integer> maxNumber = listOfIntegers.stream().max((n1, n2) -> n1.compareTo(n2));
//		Optional<Integer> maxNumber = listOfIntegers.stream().max(Integer::compare);
		System.out.println(maxNumber.get());
	}

	private void convertListOfStringsToUpperCase() {
		listOfStrings.stream().map(num -> num.toUpperCase()).forEach(System.out::println);
	}

//	private String toUpperCase(String num) {
//		return num.toUpperCase();
//	}

	private void countNumberOfWordsInString() {
		List<String> string = Arrays.asList(str.split(" "));
		long count = string.stream().count();
		System.out.println(count);
//		String[] words = str.split(" ");
//		Long count = Arrays.stream(words).count();
	}

	private void findSumOfAllEvenNumbersInList() {
		System.out.println(listOfIntegers.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum));
	}

	private void convertListOfIntegdrsToListOfStrings() {
		List<String> strList = new ArrayList<String>();
		strList = listOfIntegers.stream().map(num -> num.toString()).collect(Collectors.toList());
		System.out.println(strList);
	}

	private void mergeTwoListOfStringsAndRemoveDuplicates() {
		List<String> listOne = Arrays.asList("z", "y", "x", "w", "v");
		List<String> listTwo = Arrays.asList("a", "b", "c", "d", "v");
		List<String> finalList = new ArrayList<>();
		finalList.addAll(listOne);
		finalList.addAll(listTwo);
		finalList = finalList.stream().distinct().toList();
		System.out.println(finalList);
	}

	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();
//		ex.sortingStringsInAscendingOrder();
//		ex.printEvenNumbersFromListOfIntegers();
//		ex.findMaximimNumberFromListOfIntegers();
//		ex.convertListOfStringsToUpperCase();
//		ex.countNumberOfWordsInString();
//		ex.findSumOfAllEvenNumbersInList();
//		ex.convertListOfIntegdrsToListOfStrings();
		ex.mergeTwoListOfStringsAndRemoveDuplicates();
	}

}
