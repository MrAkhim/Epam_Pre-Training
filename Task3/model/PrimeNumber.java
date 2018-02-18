package by.epam.preTraining.task3.model;

public class PrimeNumber {
	public static boolean checkPrime(int number) {

		boolean check = true;
		int halfnumber = number / 2;

		for (int i = 2; i <= halfnumber; i++)
			if(number%i==0)
				check=false;

			return check;
	}
}
