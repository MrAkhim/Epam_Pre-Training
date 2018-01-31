import java.util.Scanner;
public class Swap7 {	
	public static void main(String[] args) {
	int N,N2, t, x7, x6, x5, x4, x3, x2, x1;
	boolean b = false;
	Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
	
		t = N;
		x1 = t % 10;
			t = t / 10;
		x2 = t % 10;
			t = t / 10;
		x3 = t % 10;
			t = t / 10;
		x4 = t % 10;
			t = t / 10;
		x5 = t % 10;
			t = t / 10;
		x6 = t % 10;
			t = t / 10;
		x7 = t % 10;
			t = t / 10;

			N2=x7+x6*10+x5*100+x4*1000+x3*10000+x2*100000+x1*1000000;
	}
}
//Написать программу, которая переворачивает (реверсирует) семизначное
//число N (к примеру, число 1234567 реверсируется в число 7654321).