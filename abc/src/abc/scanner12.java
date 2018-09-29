package abc;

import java.util.Scanner;

public class scanner12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		int x = scan.nextInt();
		String a = scan.next();
		int y = scan.nextInt();
		int i;
		switch(a) {
		
		case "+":
			i=x+y;
			System.out.println(x+"+"+y+"의 계산 결과는"+i);
			break;
		case "-":
			i=x-y;
			System.out.println(x+"-"+y+"의 계산 결과는"+i);
			break;
		case "*":
			i=x*y;
			System.out.println(x+"*"+y+"의 계산 결과는"+i);
			break;
		case "/":
			if(y==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			
			i=x/y;
			
			System.out.println(x+"/"+y+"의 계산 결과는"+i);
			break;
			
		}
		
		
		System.out.println("2015041048 강민규");
		
	}

}
