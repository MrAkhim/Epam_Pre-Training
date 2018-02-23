package by.epam.preTraining.task6.model;

import by.epam.preTraining.task6.exceptions.StackEmptyException;
import by.epam.preTraining.task6.exceptions.StackOverflowException;

public class Polindrom {
	public static boolean checkPalindrome(String str) throws StackOverflowException, StackEmptyException {
		MyStackInterface<Character> string = new MyStackArray<>();
		int i;
		for (i = 0; i < str.length() / 2; i++) {
			string.push(str.charAt(i));
		}
		if (str.length() % 2 == 1) {
			i++;
		}
		while (!string.isEmpty()) {
			if (string.pop() != str.charAt(i++)) {
				return false;
			}
		}
		return true;
	}
}
