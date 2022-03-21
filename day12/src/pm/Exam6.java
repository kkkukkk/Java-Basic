package pm;

public class Exam6 {
	public static void main(String[] args) {
	
		C c1 = new C();
		C c2 = new C(3);
		C c3 = new C(3,5);
	}
}


class C{
	C(){
		System.out.println("첫 번째 생성자");
	}
	C(int a){
		System.out.println("두 번째 생성자");
	}
	C(int a, int b){
		System.out.println("세 번째 생성자");
	}
}