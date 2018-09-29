package abc;

import java.util.Scanner;


public class scanner11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scan.nextInt();
		
		if(3<=month&&month<=5) {
			System.out.println("봄");
		}else if(6<=month&&month<=8) {
			System.out.println("여름");
		}else if(9<=month&&month<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
		
		System.out.println("2015041048 강민규");
	}

}
