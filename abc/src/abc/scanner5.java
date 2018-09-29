package abc;

import java.util.Scanner;

public class scanner5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int num[] = new int[3];
		for(int i=0;i<3;i++)
			num[i]=scan.nextInt();
		
		if(num[0]<num[1]+num[2])
			System.out.println("삼각형이 됩니다.");
		System.out.println("2015041048 강민규");
	}
	
}
