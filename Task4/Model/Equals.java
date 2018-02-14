package by.epam.preTraining.task4.model;

public class Equals {
	public static boolean check_sum_equivalent(int number,int s) {
		boolean check=false;
		if(Sum.calculate_sum_of_digits(number)==s)
			check=true;
		return check;
	}

}
