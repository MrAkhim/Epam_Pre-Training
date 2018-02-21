package by.epam.preTraining.task4.model;

public class Equals {
	public static boolean checkSumEquivalent(int number, int sum) {
		if (sum > 0 && number > 0) {
			return checkSumEquivalent(number / 10, sum - number % 10);
		}
		return number == sum;
	}
}
