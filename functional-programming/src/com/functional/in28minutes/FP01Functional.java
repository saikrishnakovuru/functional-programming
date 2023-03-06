package com.functional.in28minutes;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
	private List<String> courses = Arrays.asList("spring core", "springBoot", "AWS", "Docker", "Kuberneties",
			"salesForce", "React", "Angular", "JavaScript", "java spring");
	private List<Integer> numbers = (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

	// exercise 1
	public void printOddNumbersInList() {
		numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
		System.out.println();
	}

	// exercise 2
	public void printAllCourses() {
		courses.stream().forEach(System.out::println);
	}

	// exercise 3
	public void printCoursesContainingTheNameSpring() {
		courses.stream().filter(course -> course.contains("spring")).forEach(System.out::println);
	}

	// exercise 4
	public void printCoursesWhoseNamehasAlteast4Letters() {
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
	}

	public void printSquaresOfEvenNumbersInTheList() {
		numbers.stream().filter(num -> num % 2 == 0).map(num -> num * num).forEach(System.out::println);
	}

	public void printTheNumberOfCharactersInEachCourse() {
		courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
	}

	public static void main(String[] args) {
		FP01Functional obj = new FP01Functional();
//		obj.printOddNumbersInList(); 
//		obj.printAllCourses();
//		obj.printCoursesContainingTheNameSpring();
//		obj.printCoursesWhoseNamehasAlteast4Letters();
//		obj.printSquaresOfEvenNumbersInTheList();
		obj.printTheNumberOfCharactersInEachCourse();
	}
}
