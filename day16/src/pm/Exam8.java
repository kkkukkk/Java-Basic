package pm;

public class Exam8 {
	public static void main(String[] args) {
		
		// 생성자의 상속
		// 클래스가 상속을 받으면 부모 클래스의 모든 멤버를 내려받는다고 했지만
		// 이 멤버는 필드 메서드 이너 클래스를 말하게 된다.
		// 즉 생성자는 자식 클래스로 상속되지 않는다.
		// 절대 상속돼서는 안된다.
		
		A a1 = new A();
		B b1 = (B)a1;
		C c1 = (C)a1;
		D d1 = (D)a1;
		E e1 = (E)a1;
	}
}

//class A{
//	A(){
//	}
//}
//
//class B extends A{
//	A(){ 부모의 생성자를 그대로 내려받았다라고 생각해보면
//		 생성자??? 메서드??
//	}
//}


//객체의 다형성...
//A a1 = new A();
//A a2 = new B();

// 자식 클래스의 객체를 부모 클래스 타입으로 선언하는 다형적 표현을 사용할 수 있다.

class A{}
class B extends A{}
class C extends B{}
class D extends C{}
class E extends B{}