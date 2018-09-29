
package abc;

import java.util.Scanner;

public class pvp {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int num = scan.nextInt();
		float dollor = num / 1100;
		System.out.println(num+"원은 $"+dollor+"입니다.");
		System.out.println("2015041048 강민규");
		scan.close();
	}
}
