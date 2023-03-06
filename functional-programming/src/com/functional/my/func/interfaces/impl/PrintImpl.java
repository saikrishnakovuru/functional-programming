package com.functional.my.func.interfaces.impl;

import com.functional.my.func.interfaces.Print;

public class PrintImpl {

//	public PrintImpl() {
//		print = () -> {
//			System.out.println(T);
//		};
//	}

	private void doStuff() {
		Print<String> print = (value) -> {
			System.out.println(value);
		};
		
		print.print("sai");
	}

	public static void main(String[] args) {
		PrintImpl p = new PrintImpl();
		p.doStuff();
	}
}
