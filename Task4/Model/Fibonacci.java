package by.epam.preTraining.task4.model;

public class Fibonacci {
	public static int countFibonacciNumber(int index) {
		if (index > 1) {
			return countFibonacciNumber(index - 1) + countFibonacciNumber(index - 2);
		}
		if (index == 1) {
			return 1;
		}
		if (index < 0) {
			throw new IllegalArgumentException("index must be positive:");
		}
		return 0;
	}
}
