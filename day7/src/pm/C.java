package pm;

import am.A;

public class C {
	public void print() {
		A a = new A();
		
		System.out.println(a.a);
//		System.out.println(a.b); // protected 제어자는 같은 패키지나 자식클래스 에서만 사용 가능
//		System.out.println(a.c); // default 제어자는 같은 패키지 에서만 사용 가능
//		System.out.println(a.d); // private 제어자는 같은 클래스에서만 사용 가능
	}
}
