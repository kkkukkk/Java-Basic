package pm;

public class Exam7 {
	public static void main(String[] args) {

//		int a = 0;
//		for(int i = 0; i < 1000; i+=3) {
//			a += i;
//		}
//		System.out.println(a);

//		String star = "*";
//		for (int i = 0; i<5; i++) {
//			System.out.println(star);
//			star += "*";
//		}

//		for (int i = 0; i<10; i++) {
//			for(int j = 1; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int[] arr = { 70, 60, 55, 75, 95, 90, 80, 80, 85, 100 };

		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 100;
		for (int i : arr) {
			sum += i;
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
		}
		avg = sum / arr.length;

		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		System.out.println(arr[0]);

	}
}
