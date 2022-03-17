package day1;

public class Exam2 {
	public static void main(String[] args) {
		// 자료형
		// 변수 선언과 함께 값 대입
		int a = 3;
		
		int b;
		b = 4;
		
		System.out.println(a);
		System.out.println(b);
		
		// 변수명 짓기
		// 1. 영문 대소문자와 한글도 사용할 수 있다. (한글은 사용하지 말자)
		// 2. 특수문자는 밑줄_과 달러& 만 사용할 수 있다.
		// 3. 숫자는 사용할 수 있으나 첫 글자로는 사용할 수 없다.
		// 4. 예약어는 사용할 수 없다.(int(x), public(x))
		// *. 영문소문자를 사용하자. 의미있는 단어를 사용하자.
		// 여러 단어를 사용할 때는 두 번째 단어부터는 첫 글자는 대문자로 하자
		// ex) myWork, maxValue, bestLocation
		
		boolean aBcD; // 대문자는 새로운 단어의 앞글자로 사용하자
		byte 가나다; // 한글 변수명도 사용은 가능하지만 비추
		short _abcd; // _로 시작할 수 있다
		char $ab_cd; // $로 시작할 수 있다
		// int 3abc; // 숫자로 시작할 수 없다.
		long abcd3;
		// float int; // 예약어 int 는 사용할 수 없다
		// double main; // 예약어 main은 사용할 수 없다
		String myClassName; // 두번째 부터 단어의 첫글자는 대문자
		String ABC; // 사용은 가능하지만 비추(전부 대문자)
		
		
		
	}
}
