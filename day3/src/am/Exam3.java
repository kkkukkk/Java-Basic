package am;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(j==3) {
//					continue;
//				}
//				System.out.println(i + "," +j);
//			}
//		}
//		

//		int a = 10;
//		while (a>0) {
//			System.out.println(a);
//			a -= 2;
//		}

//		out:
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 3 && j == 2) {
//					break out;
//				}
//				System.out.println(i + "," + j);
//			}
//		}
//	
//		 
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 3 && j == 2) {
//					i = 100;
//					break;
//				}
//				System.out.println(i + "," + j);
//			}
//		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1) 빅맥");
			System.out.println("2) 타코");
			System.out.println("3) 백반");
			System.out.print("원하는 메뉴를 선택하세요 (종료: 0) >> ");
			int sel = sc.nextInt();

			if (sel == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (sel == 1 || sel == 2 || sel == 3) {
				System.out.println("선택하신 메뉴는 " + sel + "번입니다.");
			} else {
				System.out.println("잘못 선택하셨습니다.");
				continue;
			}
		}

	}
}
