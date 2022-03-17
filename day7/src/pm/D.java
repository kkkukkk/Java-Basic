package pm;

import am.A;

public class D extends A{ // D클래스는 A클래스의 자식

	public void print() {
		System.out.println(a);
		System.out.println(b); // 자식클래스는 다른 패키지에 있어도 객체의 생성 없이 protected 접근 지정자까지
//		System.out.println(c); // 접근 가능
//		System.out.println(d);
	}
	
	
}
