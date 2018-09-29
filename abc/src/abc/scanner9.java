package abc;

import java.util.Scanner;

public class scanner9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		int s_x = scan.nextInt();
		int s_y = scan.nextInt();
		float r = scan.nextFloat();
		System.out.print("점 입력>>");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		float xylength = (float) Math.sqrt((s_x-x)*(s_x-x)+(s_y-y)*(s_y-y));
		
		if(r>=xylength)
			System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
			
		
		
		System.out.println("2015041048 강민규");
	}

}
