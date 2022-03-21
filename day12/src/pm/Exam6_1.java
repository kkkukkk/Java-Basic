package pm;

public class Exam6_1 {
	public static void main(String[] args) {
		// this, this()
		// 모든 메소드는 자신이 포함된 클래스의 객체를 가리키는 this 참조 변수가 있다.
		// this. 을 생략해도 항상 자바가 추가해 주기 때문에 굳이 신경을 쓸 필요가 없어 보이지만
		// this. 명시적으로 꼭 붙여줘야 할 때가 있다.
		
		// this 메소드
		// this 키워드와 매우 비슷해 보이지만 의미가 전혀 다르다.
		// this() 메소드는 자신이 속한 클래스 내부의 다른 생성자를 호출한다.
		// this() 메소드 특징
		// 1. 생성자의 내부에서만 사용된다.
		// 2. 생성자의 첫 줄에서만 사용한다.
		// 이 두 개의 규칙 중 하나라도 지켜지지 않으면 에러가 발생한다.
		
		
	}
}

class P {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a; // this.를 생략하면 자동으로 자바가 븉여준다.
		this.n = b; // this.를 생략하면 자동으로 자바가 붙여준다.
	}
	void work() {
		this.init(2,3); // this.를 생략하면 자동으로 자바가 붙여준다.
	}
}