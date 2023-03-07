package com.zjava8.features;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class DateTimeDemo {

	private void usingLocalDate() {
		LocalDate date = LocalDate.of(1995, Month.NOVEMBER, 24);
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		System.out.println(date);
	}

	private void useInstant() {
		// Instant is machine redable
		Instant ins = Instant.now();
		System.out.println(ins);
	}

	public static void main(String[] args) {
		DateTimeDemo dtd = new DateTimeDemo();
		dtd.usingLocalDate();
		dtd.useInstant();
	}

}
