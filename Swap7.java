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
//	t=x1;
//			x1=x7;
//	x7=t;
//	t=x2;
//			x2=x6;
//	x6=t;
//	t=x3;
//			x3=x5;
//	x5=t;
//	System.out.println(x7 + " " + x6 + " " + x5+" "+x4 + " " + x3 + " " + x2 + " " + x1);

	N2=x7+x6*10+x5*100+x4*1000+x3*10000+x2*100000+x1*1000000;
	System.out.println(N2);
	}
}
//�������� ���������, ������� �������������� (�����������) �����������
//����� N (� �������, ����� 1234567 ������������� � ����� 7654321).