package pm;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >>> ");
		int per = sc.nextInt();
		int comp = (int)(Math.random()*3) + 1;
		
		System.out.println("당신은 " + per + "입니다.");
		System.out.println("컴은 " + comp + "입니다.");
		
		switch(per-comp) {
		case 0: System.out.println("비겼습니다."); break;
		case -1: case 2: System.out.println("당신이 졌습니다"); break;
		default: System.out.println("당신이 이겼습니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
