package by.epam.preTraining.task2.model;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		AlphabetMatch.checkVow1(ch);
		AlphabetMatch.checkVow2(ch);
		AlphabetMatch.checkVow3(ch);
		AlphabetMatch.checkVow4(ch);

	}

}
