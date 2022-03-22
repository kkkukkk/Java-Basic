package pm;

public class Exam7_1 {
	public static void main(String[] args) {
		// 실행중인 쓰레드의 갯수 확인
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드의 이름 = " + curThread.getName());
		System.out.println("현재 쓰레드의 개수 = " + curThread.activeCount());
	}
}
