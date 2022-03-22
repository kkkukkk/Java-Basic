package pm;

public class Exam6_1 {
	public static void main(String[] args) {
		// 객체 생성 및 시작
		Thread smiVideoThread = new VideoThread();
		smiVideoThread.start();

		Thread smiAudioThread = new AudioThread();
		smiAudioThread.start();
	}
}

class VideoThread extends Thread {

	@Override
	public void run() {
		int[] intArray = { 1, 2, 3, 4, 5 }; // 비디오 프레임
		for (int a : intArray) {
			System.out.print("비디오 프레임 " + a);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

class AudioThread extends Thread {
	@Override
	public void run() { // 자막 쓰레드
		String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		for (String b : strArray) {
			System.out.println(" - 자막번호 " + b);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}