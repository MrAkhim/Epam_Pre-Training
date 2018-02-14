package by.epam.preTraining.task4.model;

public class Sum {
	public static int calculate_sum_of_digits(int number) {
		if (number>0)
		return number=number%10+calculate_sum_of_digits(number/10);
		else
			return 0;
	}
}
