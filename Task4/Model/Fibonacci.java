package by.epam.preTraining.task4.model;

public class Fibonacci {
	public static int countFibonacciNumber(int index) {
		if(index >1)
			return index=countFibonacciNumber(index-1)+countFibonacciNumber(index-2);
		if(index==1)
			return 1;
		else 
			return 0;
	}
}
