package abc;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int num=scan.nextInt();

			if(num/50000>0) {
				System.out.println("�������� " + num/50000 + "��");
				num %= 50000;
			}
			if(num/10000>0) {
				System.out.println("������ " + num/10000 + "��");
				num %= 10000;
			}
			if(num/1000>0) {
				System.out.println("õ���� " + num/1000 + "��");
				num %= 1000;
			}
			if(num/100>0) {
				System.out.println("����� " + num/1000 + "��");
				num %= 100;
			}
			if(num/50>0) {
				System.out.println("���ʿ��� " + num/50 + "��");
				num %= 50;
			}
			if(num/10>0) {
				System.out.println("�ʿ��� " + num/10 + "��");
				num %= 10;
			}
			if(num/1>0) {
				System.out.println("�Ͽ��� " + num/1 + "��");
				num %= 1;
			}
		
			
		scan.close();
		System.out.println("2015041048 ���α�");
	}

}
