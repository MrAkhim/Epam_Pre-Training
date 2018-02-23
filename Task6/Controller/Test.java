package by.epam.preTraining.task6.controller;

import by.epam.preTraining.task6.model.Polindrom;
import by.epam.preTraining.task6.view.View;

public class Test {
	public static void main(String[] args) {
		try {
			String str = "sum summus mus";
			View.show(Polindrom.checkPalindrome(str));
		} catch (Exception e) {
			View.show(e.getMessage());
		}
	}
}
