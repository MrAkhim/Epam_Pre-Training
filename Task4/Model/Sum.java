package by.epam.preTraining.task4.model;

public class Sum {
	public static int digitsSum(int number) {
		number=Math.abs(number);
		if (number > 0) {
			return number % 10 + digitsSum(number / 10);
		}
		return 0;
	}
}
