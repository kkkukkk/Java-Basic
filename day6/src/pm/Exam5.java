package pm;

public class Exam5 {
	public static void main(String[] args) {
		C c = new C();
		c.print();
		
		int k = c.data();
		System.out.println(k);
		
		double result = c.sum(3, 5.2);
		System.out.println(result);
		
		c.printMonth(5);
		c.printMonth(13);
		c.printMonth(0);
	}
}


class C {
	// no input no return
	void print() {
		System.out.println();
	}
	
	// no input yes output
	int data() { // int return의 타입
		return 3;
	}
	
	// yes input yes output
	double sum(int a, double b) { //return 타입
		return a + b;
	}
	
	void printMonth(int m) { //void 리턴이 없다.
		if(m<=0 || m>12) {
			System.out.println("월을 잘못 입력하셨습니다.");
			return; // 메서드를 빠져나가기 위한 return
		}
		System.out.println(m+"월입니다.");
	}
	
	
}