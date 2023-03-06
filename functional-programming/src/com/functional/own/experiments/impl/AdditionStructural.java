package com.functional.own.experiments.impl;

import com.functional.own.experiments.Fp01AddI;
import com.functional.own.experiments.Fp01SysOut;

public class AdditionStructural<T> implements Fp01AddI, Fp01SysOut<T> {

	@Override
	public void print(T t) {
		System.out.println(t);
	}

	@Override
	public void add(int a, int b) {
//		return (a + b);
	}

	public static void main(String[] args) { 
		AdditionStructural<Object> as = new AdditionStructural<>();
//		as.add(5, 6);
//		as.print(as.add(5, 6));
	}

}
