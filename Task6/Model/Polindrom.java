package by.epam.preTraining.task6.model;

import by.epam.preTraining.task6.exceptions.StackEmptyException;
import by.epam.preTraining.task6.exceptions.StackOverflowException;

public class Polindrom {
	public static boolean checkPalindrome(String str) throws StackOverflowException, StackEmptyException {
		MyStackInterface<Character> string = new MyStackArray<>();
		int half = str.length() / 2;
		for (int i = half; i < str.length(); i++) {
			string.push(str.charAt(i));
		}
		int i = 0;
		while (!string.isEmpty()) {
			if (string.pop() != str.charAt(i++)) {
				return false;
			}	
		}
		return true;
	}
} 		 //Сложность О(N)

