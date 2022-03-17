package pm;

public class Exam7_2 {
	public static void main(String[] args) {
		// 모든 생성자의 첫줄에는 반드시 this() 또는 super()가 있엇야 한다.
		// 없으면 자동으로 자바가 삽입한다.
		// 즉 상속관계에 있을 때 생성자를 호출하면 항상 부모 클래스의 생성자가
		// 호출 된다는 것이다. 자식 클래스로 객체를 생성할 떄는 부모 클래스의
		// 객체도 만들어 진다.
		
		X x = new X();
		
		
	}
}

class V{
	V() {
		System.out.println("V 생성자");
	}
}

class X extends V{
	X() {
//		super(); // 부모의 생성자 호출 
		System.out.println("X 생성자");
	}
}