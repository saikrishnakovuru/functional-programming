package com.functional.own.experiments.impl;

import com.functional.own.experiments.Fp01AddI;
import com.functional.own.experiments.Fp01SysOut;

public class AdditionFuctional {
	private Fp01AddI addI;
	private Fp01SysOut<Integer> sysOut;

	public AdditionFuctional() {
		sysOut = (data) -> {
			System.out.println(data);
		};

		addI = (a, b) -> {

			sysOut.print(a + b);
		};

		addI.add(5, 6);
//		sysOut.print(addI.add(5, 6));

	}

	public static void main(String[] args) {
		new AdditionFuctional();
	}
}
