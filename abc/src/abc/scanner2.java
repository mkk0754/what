package abc;

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = scan.nextInt();
		
		if(num/10==num%10)
			System.out.println("Yes! 10���ڸ��� 1�� �ڸ��� �����ϴ�.");
		System.out.println("2015041048 ���α�");
	}

}
