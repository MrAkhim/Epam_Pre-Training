package by.epam.preTraining.task3.model;

public class GCDandLCM {
	public static int findGCD(int number1, int number2) {
		return number2 == 0 ? number1 : findGCD(number2, number1 % number2);
	}
	public static int findLCM(int number1,int number2) {
		return number1/findGCD(number1,number2)*number2;
	}
}
