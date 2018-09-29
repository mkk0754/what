package abc;

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scan.nextInt();
		
		if(num/10==num%10)
			System.out.println("Yes! 10의자리와 1의 자리가 같습니다.");
		System.out.println("2015041048 강민규");
	}

}
