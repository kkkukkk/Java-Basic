package pm;

public class Exam4 {
	public static void main(String[] args) {

//		int a = 85;
//		if (a >= 70 && a < 80) {
//			System.out.println("C학점");
//		} else if (a >= 80 && a < 90) {
//			System.out.println("B학점");
//		} else if (a >= 90) {
//			System.out.println("A학점");
//		} else {
//			System.out.println("F학점");
//		}

		// 효울성 & |를 하나만 사용하면 모둔 조건을 모두 확인하여 결정한다.
		// 두개를 사용하면 조건을 전부 확인하지 않고 하나만으로도 결정한다
		// 논리 연산자는 비트연산자와 매우 비슷하지만 피연산자로
		// boolean만 올 수 있고 연산 결과 또한 boolean타입만을 지닌다

		// switch 구문
		// switch는 변수값에 따라서 특정위치 case로 이동해서 선택하는
		// 선택 제어문이다.

//		int a = 2;
//		switch(a) {
//		case 1:
//			System.out.println("A");
//			break;
//		case 2:
//			System.out.println("B");
//			break;
//		case 3:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("0");
//		}

//		int a = 9;
//		switch (a) {
//		case 10:
//			System.out.println("pass");
//			break;
//		case 9:
//			System.out.println("pass");
//			break;
//		case 8:
//			System.out.println("pass");
//			break;
//		case 7:
//			System.out.println("pass");
//			break;
//		default:
//			System.out.println("fail");
//		}
//
//		int b = 9;
//		switch (b) {
//		case 10:case 9:case 8:case 7:
//			System.out.println("pass"); break;
//		default:
//			System.out.println("fail");
//		}

		int a = 8;
		if (7<=a&&a<=10) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		int b = 88;
		switch (b/10) {
		case 10: case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default: System.out.println("F");
		}
		
		
		int mon = 3;
		switch(mon/3) {
		case 1: System.out.println("봄입니다"); break;
		case 2: System.out.println("여름입니다"); break;
		case 3: System.out.println("가을입니다"); break;
		default: System.out.println("겨울입니다");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
