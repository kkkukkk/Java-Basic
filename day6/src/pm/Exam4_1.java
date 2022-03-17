package pm;

public class Exam4_1 {
	public static void main(String[] args) {
		B b = new B();
		
		b.printFieldValue();
		b.printLocalValue();
	}
}

class B{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue(){
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalValue() {
		int k;
		//System.out.println(k); // 지역변수를 초기화 하지 않으면 오류가 발생
		
		// 자바 문법은 서로 얽히고 설켜있어서 하나를 설명하다 보면
		// 아직 배우지 않은 뭔가를 먼저 얘기해야 할 때가 있다.
		// 지금은 잘 이해가 안되더라도 다른 부분은 공부하는 과정에서 쉽게 이해되는 일이 많다
	}
	
	
}