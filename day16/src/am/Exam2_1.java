package am;

public class Exam2_1 {
	public static void main(String[] args) {
	
		D d = new D();
		d.print();
		d.print(3);
		d.print(5.8);
		d.print("안녕");
	}
}


class D{
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	void print(int a) {
		System.out.println("정수 입력값 : "+a);
	}
	void print(double b) {
		System.out.println("실수 입력값 : "+b);
	}
	void print(String c) {
		System.out.println("문자열 입력값: "+c);
	}
}