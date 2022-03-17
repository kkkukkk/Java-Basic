package pm;

public class Exam6 {
	public static void main(String[] args) {
		// 반복문
		// 실행 구문을 반복적으로 수행하는 반복 제어문으로 일반적으로 반복 횟수가 정확할때
		// 주로 사용한다. 즉, for문의 구문을 보면 몇 번 반복할 지 유추할 수 있어야한다.
		// for(start; stop; step){
		// }

//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
		// for 문에서의 무한루프
//		for (int i = 0; ; i++) {
//		}
		
//		for(;;) {
//			System.out.println("무한");
//		}
		
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.println(i+"일차 "+j+"교시");
			}
		}
		
		// for each
		// array 배열
		
		//String name = "홍길동"; 변수 1개에 데이터 1개 저장
		String[] names = {"홍길동", "이몽룡", "성춘향"};
		int[] numbers = {1,2,3,4,5};
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
