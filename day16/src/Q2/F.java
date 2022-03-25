package Q2;

public class F {
	int a = 2;
	static int b = 3;
	
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void bcd() {
//		System.out.println(a); // static 메소드에는 static 변수만 객체 생성없이 가져다 쓸 수 있다.
		System.out.println(b);
	}
}
