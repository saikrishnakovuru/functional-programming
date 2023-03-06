package com.functional.my.func.interfaces.impl;

import com.functional.my.func.interfaces.Addition;

public class AdditionImpl {
	private Addition addition;

	public AdditionImpl() {
		addition = (a, b) -> {
			return a + b;
		};
	}

	private void doStuff() {
		System.out.println(addition.add(5, 6));
	}

	public static void main(String[] args) {
		AdditionImpl add = new AdditionImpl();
		add.doStuff();

	}
}
