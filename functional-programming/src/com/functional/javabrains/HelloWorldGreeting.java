package com.functional.javabrains;

public class HelloWorldGreeting implements Greeting {

//	@Override
//	public void perform() {
//		System.out.println("Hello world");
//	}

	@Override
	public void perform(String message) {
		System.out.println(message);
	}

}
