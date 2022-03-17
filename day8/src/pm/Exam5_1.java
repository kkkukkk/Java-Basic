package pm;

public class Exam5_1 {
	public static void main(String[] args) {
		// 메소드 오버라이딩 method overriding
		// 메소드 덮어쓰기
		// 부모 클래스에게 상속받은 메소드와 동일한 이름의 메소드를 재 정의 하는것
		// 1. 부모클래스의 메소드와 타입과 개수가 동일해야 한다.
		// 2. 부모 클래스의 메소드보다 접근지정자의 범위가 같거나 넓어야 한다.
		
		// class A() {
		// 		void print(){
		// 				System.out.println("A클래스");
		//		}
		// }
		
		// class B() extends A{
		// 		void print(){
		// 				System.out.println("B클래스");
		// 		}
		// }
		
		// 오버라이딩을 덮어쓰기라고 표현은 했지만 사실 차이가 있다.
		// 덮어쓰기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념이지만
		// 오버라이딩은 이전 print() 메소드 위에 새로운 메소드가 올라타는 개념이다.
		// 사실은 부모의 print() 메소드를 강제로 호출할 수도 있다.
		
		// 메소드 오버라이딩을 사용하는 이유
		// class Animal {
		// 		void cry() {}
		// }
		
		// class Bird extends Animal{
		// 		void cry() {
		//			System.out.println("짹짹");	
		//		}
		// }
		
		// class Cat extends Animal{
		// 		void cry() {
		//			System.out.println("야옹");	
		//		}
		// }
		
		// class Dog extends Animal{
		// 		void cry() {
		//			System.out.println("멍멍");	
		//		}
		// }
		
		
		Q q = new Q(); // Q 자료형 / Q 생성자
		q.print();	
		
		W w = new W();	// W 자료형 / W 생성자
		w.print();
		
		Q qw = new W(); // Q 자료형 / W 생성자
		qw.print();
	}
}

class Q {
	void print() {
		System.out.println("Q 클래스");
	}
}
class W extends Q{
	void print() {
		System.out.println("W 클래스");
	}
}
