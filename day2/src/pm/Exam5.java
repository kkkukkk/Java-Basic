package pm;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		
		// import 방법 ctrl + shift + o 여러개를 모두 import
		// ctrl + space 하나씩 import
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >> ");
		int mon = sc.nextInt();
		String eng = "";
		switch(mon) {
		case 1: eng = "Jan"; break;
		case 2: eng = "Feb"; break;
		case 3: eng = "Mar"; break;
		case 4: eng = "Apr"; break;
		case 5: eng = "May"; break;
		case 6: eng = "Jun"; break;
		case 7: eng = "Jul"; break;
		case 8: eng = "Aug"; break;
		case 9: eng = "Sep"; break;
		case 10: eng = "Oct"; break;
		case 11: eng = "Nov"; break;
		case 12: eng = "Dec";
		}
		System.out.println(eng);
	}
}
