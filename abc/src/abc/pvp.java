
package abc;

import java.util.Scanner;

public class pvp {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int num = scan.nextInt();
		float dollor = num / 1100;
		System.out.println(num+"���� $"+dollor+"�Դϴ�.");
		System.out.println("2015041048 ���α�");
		scan.close();
	}
}
