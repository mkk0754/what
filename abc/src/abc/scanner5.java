package abc;

import java.util.Scanner;

public class scanner5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int num[] = new int[3];
		for(int i=0;i<3;i++)
			num[i]=scan.nextInt();
		
		if(num[0]<num[1]+num[2])
			System.out.println("�ﰢ���� �˴ϴ�.");
		System.out.println("2015041048 ���α�");
	}
	
}
