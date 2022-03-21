package pm;

public class Exam4 {
	public static void main(String[] args) {
		// 클래스와 객체
		// 객체는 사용 가능한 실체를 의미하고
		// 클래스는 그 객체를 생성하기 위한 설계도
		
		// 절차지향은 이야기를 순서대로 쓰듯이 프로그램을 구성하는 방식
		// 객체지향은 프로그램에서 사용되는 객체를 생성하고
		// 그 객체에 포함된 데이터와 기능을 상호 호출하는 방식으로
		// 프로그램을 구성, 객체에 포함되는 데이터는
		// 속성 또는 필드라고 부르고 기능을 메소드라고 부른다.
		
		// 자바에서 제공되는 객체지향 요소
		// 일반 클래스, 추상 클래스, 인터페이스
		// 클래스와 인터페이스를 사용하여 객체를 만들고
		// 이것을 활용하여 프로그램을 실행한다.
		
		// 클래스의 구성 요소
		// 외부 : 패키지, 임포트, 외부클래스
		// 내부 : 필드, 메소드, 생성자, 이너클래스
		
		// 객체 : 그 객체 하나만을 얘기할 때 사용하는 단어
		// 인스턴스 : 클래스와의 관계를 얘기할 때 사용하는 단어
		
		// 객체 생성방법
		//		클래스명 생성할객체명 = new 생성자명();
		// 객체 사용방법
		
		// 		a.m 		// 필드
		//  	a.print(); 	// 메소드
		
		
		A a = new A();
		System.out.println(a.m);
		
	}
}

class A{
	int m = 3; // 필드, 전역변수
	int n = 4;
	void work1() {
		int k = 5; // 지역변수
		System.out.println(k);
		work2(2);
	}
	
	void work2(int i) {
		int j = 4;
		System.out.println(i+j);
	}
}
