package abc;

import java.util.Arrays;
import java.util.Scanner;

public class scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է�>>");
		int[] num = new int [3];
		for(int i=0;i<3;i++) 
			num[i]=scan.nextInt();
		
		Arrays.sort(num);
		
		System.out.println("�߰� ���� " + num[1]);
		System.out.println("2015041048 ���α�");
	}


}
