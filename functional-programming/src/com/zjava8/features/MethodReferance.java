package com.zjava8.features;

import java.util.stream.Stream;

interface Parser {
	String parse(String str);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() <= 3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		return s;
	}
}

class MyPrinter {
	public void print(String str) {
//		Parser p = s -> {
//			if (s.length() <= 3)
//				s = s.toUpperCase();
//			else
//				s = s.toLowerCase();
//			return s;
//		};
 
		Parser p = StringParser::convert;
//		Stream s= Stream.of(str);
//		s.map(null)

		System.out.println(p.parse(str));
	}
}

public class MethodReferance {
	public static void main(String[] args) {
		String str = "sai";
		MyPrinter mp = new MyPrinter();
		mp.print(str);
	}
}
