package am;

public class Exam2 {
	public static void main(String[] args) {
		// Break 제어 키워드
		// break는 if구문을 제외한 {}를 탈출하는 제어키워드이다.
		// 일반적으로 반복문에서 특정 조건을 만족하는 경우
		// 반복문을 탈출하는데 사용한다.

//		for (int i = 0; i < 10; i++) {
//			if (i == 5) {
//				break;
//			} // if구문으로 break키워드를 실행할 조건을 설정
//			System.out.println(i);
//		} // break로 탈출하게 되는 중괄호

		// 꼭 기억해야 하는 점은 break를 이용해 탈출하는 것은
		// if문을 제외한 가장 가까운 중괄호라는 것이다.
		// 따라서 만약 이중으로 중복된 for문에서 break를 사용할 경우
		// 안쪽 for문만 탈출하게 된다.

//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				if (j == 3) {
//					break;
//				}
//				System.out.println(i + " " + j);
//			} // break로 탈출하게 되는 중괄호
//		}

		// j가 3이 되면 break로 탈출하게 되는 반복문은 안쪽의 for이다.
		// 탈출을 한 뒤에도 바깥쪽 for문 내부에 있기 때문에 i값의
		// 변화에 따른 반복은 여전히 유효하게 된다.

		out: // 위치 지정 레이블
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					break out;
				}
				System.out.println(i + " " + j);
			} // break로 탈출하게 되는 중괄호
		}

		// continue 제어 키워드
		// 반복과정에서 특정 구문을 실행하지 않고 건너뛰는 용도로 사용한다.
		for (int i = 0; i < 10; i++) {
			if (i%2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		
		
		
		
		
		
		
		
		
		
	}
}
