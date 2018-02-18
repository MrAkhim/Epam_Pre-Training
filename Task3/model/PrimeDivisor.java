package by.epam.preTraining.task3.model;

public class PrimeDivisor {
	public static void findPrimeDivisors(int number) {

//		int[] divisors = new int[100];
//		int[] primeDivisors = new int[100];

		int halfnumber = number / 2;
//		int j = 0, k = 0;

		for (int i = 2; i <= halfnumber; i++)
			if (number % i == 0)	
				if(PrimeNumber.checkPrime(i))
					System.out.println(i);// Сделать без массива. 
										//Сразу провереку PrimeNumber.checkPrime

//		for (int v : divisors) {
//			if (PrimeNumber.checkPrime(divisors[v]))
//			primeDivisors[k++] = divisors[v];
////		}
//
//		return primeDivisors;
	}
}
