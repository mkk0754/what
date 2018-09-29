package abc;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int num=scan.nextInt();

			if(num/50000>0) {
				System.out.println("오만원권 " + num/50000 + "매");
				num %= 50000;
			}
			if(num/10000>0) {
				System.out.println("만원권 " + num/10000 + "매");
				num %= 10000;
			}
			if(num/1000>0) {
				System.out.println("천원권 " + num/1000 + "매");
				num %= 1000;
			}
			if(num/100>0) {
				System.out.println("백원권 " + num/1000 + "매");
				num %= 100;
			}
			if(num/50>0) {
				System.out.println("오십원권 " + num/50 + "매");
				num %= 50;
			}
			if(num/10>0) {
				System.out.println("십원권 " + num/10 + "매");
				num %= 10;
			}
			if(num/1>0) {
				System.out.println("일원권 " + num/1 + "매");
				num %= 1;
			}
		
			
		scan.close();
		System.out.println("2015041048 강민규");
	}

}
