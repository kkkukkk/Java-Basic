package pm;

public class Exam5_2 {
	public static void main(String[] args) {
		// Method Overloading
		
		
//		printa(); // 인수가 없을 때
//		printb(3); // 인수가 1개, int형
//		printc(5.8); // 인수가 1개, double형
//		printd(2,5); // 인수가 2개
		
		//print(); // 하나의 메소드명으로 인수의 개수와 형에 따라 동작을 다르게 한다.
		print();
	}
	
//	public static void printa() {
//		System.out.println("데이터가 없습니다. ");
//	}
//	
//	public static void printb(int b) {
//		System.out.println(b);
//	}
	public static void print() {
		System.out.println("데이터가 없습니다. ");
	}
	
	public static void print(int a) {
		System.out.println("a");
	}
	
	
}
