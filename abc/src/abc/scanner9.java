package abc;

import java.util.Scanner;

public class scanner9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		int s_x = scan.nextInt();
		int s_y = scan.nextInt();
		float r = scan.nextFloat();
		System.out.print("�� �Է�>>");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		float xylength = (float) Math.sqrt((s_x-x)*(s_x-x)+(s_y-y)*(s_y-y));
		
		if(r>=xylength)
			System.out.println("�� (" + x + ", " + y + ")�� �� �ȿ� �ִ�.");
			
		
		
		System.out.println("2015041048 ���α�");
	}

}
