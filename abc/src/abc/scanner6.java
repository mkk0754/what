package abc;

import java.util.Scanner;

public class scanner6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scan.nextInt();
		int count=0;
		if(num/10==3||num/10==6||num/10==9)
			count++;
		if(num%10==3||num%10==6||num%10==9)
			count++;
		
		if(count==1)
			System.out.println("�ڼ�¦");
		else if(count==2)
			System.out.println("�ڼ�¦¦");
		System.out.println("2015041048 ���α�");
	}
	
}
