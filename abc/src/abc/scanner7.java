package abc;

import java.util.Scanner;

public class scanner7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(100<=x||x<=200)
			if(100<=y||y<=200)
				System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		System.out.println("2015041048 ���α�");
	}

}
