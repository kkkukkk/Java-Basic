package pm;

public class Exam6_2 {
	public static void main(String[] args) {
		
		Y y1 = new Y();
		Y y2 = new Y(3);
	}
}

class Y{
	Y(){ // 기본 생성자
		System.out.println("첫 번째 생성자");
	}
	Y(int a){
		this(); // 첫 줄에 위치한다.
		System.out.println("두 번째 생성자");
	}
	
}