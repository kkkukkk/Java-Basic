package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String chk = "";
//		do {
//			chk = "";
//			System.out.println("세자리의 정수 >>> ");
//			int num = sc.nextInt();
//			chk += num;
//		} while (chk.length() != 3);
//
//		System.out.println("입력한 값은 " + chk + "입니다");

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("10부터 99사이의 숫자를 맞추세요! ");
		int rnd = 10 + rand.nextInt(90);
		int ans;
		do {
			System.out.print("어떤 숫자일까요? >> ");
			ans = sc.nextInt();
			if (rnd > ans){
				System.out.println("더 큰 숫자입니다.\n");
			}else if(rnd<ans) {
				System.out.println("더 작은 숫자입니다.\n");
			}
		}while(rnd != ans);
		System.out.println("정답입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
