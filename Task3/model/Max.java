package by.epam.preTraining.task3.model;

public class Max {
	static int max=0;
	public static int searchMax(int number) {
		while(number!=0) {
			max = max>(number%10)? max : (number%10);
			number/=10;}
		return max;
	}
}
