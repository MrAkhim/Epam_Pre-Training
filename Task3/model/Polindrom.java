package by.epam.preTraining.task3.model;

public class Polindrom {

	public static boolean checkPolindrom(int number) {
		
		boolean check = false;
		int newnumber = 0;
		int temporary = number;
		
		while (temporary != 0) {
			newnumber *= 10;
			newnumber += temporary % 10;
			temporary /= 10;
		}
	
		if (newnumber == number)
			check = true;
		
		return check;
	}
}
