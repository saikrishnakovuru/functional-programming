package com.functional.my.func.interfaces.impl;

import com.functional.my.func.interfaces.IsEven;

public class IsEvenImpl {
	private IsEven isEven;

	public IsEvenImpl() {
		isEven = (value) -> {
			return value % 2 == 0;
		};
	}

	private void doStuff() {
		System.out.println(isEven.isEven(101));
	}

	public static void main(String[] args) {
		IsEvenImpl isEven = new IsEvenImpl();
		isEven.doStuff();
	}
}
