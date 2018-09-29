package abc;

import java.util.Scanner;

public class scanner7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(100<=x||x<=200)
			if(100<=y||y<=200)
				System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
		System.out.println("2015041048 강민규");
	}

}
