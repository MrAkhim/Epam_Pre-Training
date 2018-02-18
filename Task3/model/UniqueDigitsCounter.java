package by.epam.preTraining.task3.model;

public class UniqueDigitsCounter {
	public static int countUniqueDigits(int number) {
		String uniqueDigits = "";
		int digit;

		if (number != 0) {
			while (number > 0) {
				digit = number % 10;
				if (!uniqueDigits.contains(digit + "")) {
					uniqueDigits += digit;
				}
				number /= 10;
			}
		} else {
			uniqueDigits = "0";
		}
		return uniqueDigits.length();
	}
}
