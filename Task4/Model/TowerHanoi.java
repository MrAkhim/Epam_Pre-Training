package by.epam.preTraining.task4.model;

public class TowerHanoi {
	static String str="";
	public static String deduceHanoi�lgorithm(int rings,String base,String end,String temp){
		if(rings>1) {
		deduceHanoi�lgorithm(rings-1, base, temp, end);
		deduceHanoi�lgorithm(1, base, end, temp);
		deduceHanoi�lgorithm(rings-1, temp, end , base);
		}
		if(rings==1)
			{str+=base+"->"+end+"\n";
		}
		if(rings<1)
			str="Error:Enter positive integer";
		return str;
	}
}

