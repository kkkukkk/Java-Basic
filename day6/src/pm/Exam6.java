package pm;

public class Exam6 {
	public static void main(String[] args) {
		// 가변길이 메소드
		// 메소드 오버로딩은 입력변수의 개수 혹은 자료형에 따라서 구분된다.
		// 만약 입력 변수로 1~100 사이의 불특정 갯수로 입력 들어오게 되면
		// 메소드도 100개를 만들어야 한다.
		// 이것을 간단하게 할 수 있는 방법이 바로 가변 길이 매개변수를 사용하는 메소드이다.
		
//		sum(1);
//		sum(1,2);
//		sum(1,2,3);
//		
//	}
//	
//	public static void sum(int a) {
//		
//	}
//	public static void sum(int a, int b) {
//		
//	}
//	public static void sum(int a, int b, int c) {
//		
//	}
		
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕","방가");
		method2("땡큐","베리","감사");
		method2();
	
	}
	
	public static void method1(int...values){
		System.out.println("길이 : " + values.length);
		
		for(int each : values) {
			System.out.print(each + " ");
		}
	}
	
	public static void method2(String...values) {
		System.out.println("길이 : " + values.length);
		
		for(String each: values) {
			System.out.println(each + " ");
		}
	}
}
