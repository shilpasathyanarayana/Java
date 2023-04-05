package com.shilpa.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class WhyLambda {
	private static Consumer<String> print = (value) -> System.out.println(value);
	private static Consumer<String> attach = (value) -> {
		System.out.print("printing value:");
		System.out.println(value + " is human");
	};

	public static void main(String[] args) {
		// String names[] = new String[] { "Avinash", "Shilpa" };
		WhyLambda w = new WhyLambda();
		// w.print(names);
		// w.attach(names);
		String tress[] = new String[] { "Mango", "Jackfruit" };
		// w.print(tress);

		List<String> names = new ArrayList<>();

		names.add("Avinash");
		names.add("Shilpa");

		w.perform(names, print);
		w.perform(names, attach);
		w.printFunction(tress);
		// w.attach(tress);

		List<Integer> marks = new ArrayList<>();

		marks.add(10);
		marks.add(20);
		marks.add(30);

		// normal for loop
		for (int i = 0; i < marks.size(); i++) {
			System.out.println("the marks are " + marks.get(i));
		}
		// enhanced for loop using a List
		for (Integer mark : marks) {
			System.out.println("The mark is " + mark);
		}

		// using lambda
		Consumer<Integer> printMarks = (mark) -> System.out.println("The mark using third for loop is " + mark);
		marks.forEach((mark) -> System.out.println("The mark using third for loop is " + mark));
		// normal array with 2 different for loops
		int marksArray[] = new int[3];
		marksArray[0] = 80;
		marksArray[1] = 90;
		marksArray[2] = 48;
		for (int i = 0; i < marksArray.length; i++) {
			System.out.println("marks in normal array using normal for loop are " + marksArray[i]);
		}

		for (Integer marksArray1 : marksArray) {
			System.out.println("marks in normal array using enhanced for loop are " + marksArray1);

		}
	}

	public void printFunction(String[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

	}

	public void attach(String[] values) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			sb.append(values[i] + " is human, ");
		}
		System.out.println(sb.toString());
	}

	public void perform(List<String> values, Consumer<String> action) {
		values.forEach(action);
	}
}
