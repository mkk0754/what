package abc;

import java.util.Scanner;

public class scanner12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("����>>");
		int x = scan.nextInt();
		String a = scan.next();
		int y = scan.nextInt();
		int i;
		switch(a) {
		
		case "+":
			i=x+y;
			System.out.println(x+"+"+y+"�� ��� �����"+i);
			break;
		case "-":
			i=x-y;
			System.out.println(x+"-"+y+"�� ��� �����"+i);
			break;
		case "*":
			i=x*y;
			System.out.println(x+"*"+y+"�� ��� �����"+i);
			break;
		case "/":
			if(y==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				break;
			}
			
			i=x/y;
			
			System.out.println(x+"/"+y+"�� ��� �����"+i);
			break;
			
		}
		
		
		System.out.println("2015041048 ���α�");
		
	}

}
