package pm;

import am.A;

public class Exam7 {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.a);		
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);
		System.out.println();
		
		a.print(); // public 메소드를 활용하면 접근제한자로 제한된 변수들도 사용할 수 있다.
	}
}
