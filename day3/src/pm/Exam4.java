package pm;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("숫자입력 >>> ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//		case 0: System.out.println("입력하신 숫자는 0입니다.");break;
//		default: System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}

//		System.out.print("숫자입력 >>> ");
//		int num = sc.nextInt();
//		System.out.println(num == 0 ? "입력하신 숫자는 0입니다" : "입력하신 숫자는 0이 아닙니다");

		// 90점 이상이면 A 80점 이상이면 B....
		// 98점이상이면 A+
		System.out.println("점수를 입력해주세요 >> ");
		int score = sc.nextInt();
		
		String grd = "";
		String ad = "";
		
		if (score >= 90) {
			grd = "A";
		}else if( score >= 80) {
			grd = "B";
		}else if( score >= 70) {
			grd = "C";
		}else if( score >= 60) {		
			grd = "D";
		}else {
			grd = "F";
		}
		
		if (grd != "F") {
			if (score == 100 || score%10 >= 7) {
				ad = "+";
			}else if(score%10 <= 4) {
				ad = "-";
			}
		}
		System.out.println("당신의 점수는 "+score+"점이고 학점은 "+grd+ad+"입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
