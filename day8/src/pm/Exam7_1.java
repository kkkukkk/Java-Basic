package pm;

public class Exam7_1 {
	public static void main(String[] args) {
		
		// 부모 클래스의 init() 메소드가 있고 그 메소드의 500줄의 코드가 있다.
		// 그런데 자식 클래스는 그 부모 클래스의 기능에다가 어떤 1줄만 추가하고 싶을 때
		// super가 없다면 자식 클래스에는 부모 클래스의 메소드에 있는 500줄과 1줄을 모두 작성해야 한다.
		// 그런데 super를 사용하면 자식 클래스의 메소드에서 부모클래스의 메소드를 호출하고
		// 추가코드 1줄만 작성하면 된다.
	}
}

class U{
	void init() {
		// 어쩌구 저쩌구 500줄
	}
}

class I extends U{
	void init() {
		// 어쩌구 저쩌구 500줄		
	}
	// 화면 출력 메소드
}

class K extends U{
	void init() {
		super.init();
	}
	
}