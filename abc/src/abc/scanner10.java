package abc;

import java.util.Scanner;


public class scanner10 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int s1_x = scan.nextInt();
		int s1_y = scan.nextInt();
		int s1_r = scan.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int s2_x = scan.nextInt();
		int s2_y = scan.nextInt();
		int s2_r = scan.nextInt();
		
		
		float xylength = (float) Math.sqrt((s1_x-s2_x)*(s1_x-s2_x)+(s1_y-s2_y)*(s1_y-s2_y));
		if(xylength >= s1_r+s2_r)
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		else
			System.out.println("�� ���� ���� ��ģ��.");
		
		
		System.out.println("2015041048 ���α�");
			
	}

}
