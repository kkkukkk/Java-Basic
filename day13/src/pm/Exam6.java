package pm;

public class Exam6 extends Thread{
		// 1. 쓰레드 클래스를 상속받아서 run() 메소드를 오버라이딩
		
		// step 1 클래스 정의
		// step 2 객체를 생성
		// step 3 쓰레드 실행
	
	@Override
	public void run() {
		String[] strArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for (String b : strArray) {
			System.out.println(" - 자막번호 " + b);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		
		//객체 생성 및 시작
		Thread smiFileThread = new Exam6();
		smiFileThread.start();
		
		int[] intArray = {1,2,3,4,5}; // 비디오 프레임
		for (int a: intArray) {
			System.out.print("비디오 프레임 " + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}
	
}

// 이전에 단일 쓰레드로 실행했던 비디오 프레임과 자막을 출력하는 프로그램을 멀티 쓰레드로 변경하였다.
// 출력하고자 하는 작업은 비디오 프레임의 번호와 자막의 동시 출력이다.
// 프로그램이 처음 실행될 때 이미 main 쓰레드가 실행되고 있으므로 이 2 개의 작업을 동시에 실행하기 위해서는
// 적어도 하나 이상의 쓰레드를 추가로 생성하여 실행해야 한다.

// Thread 클래스를 상속받아서 클래스를 정의했고
// 객체를 생성하여 start() 메소드를 실행했다.
