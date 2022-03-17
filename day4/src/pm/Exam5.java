package pm;

import java.util.Arrays;

public class Exam5 {
	public static void main(String[] args) {
		// 배열 객체에서 값 넣기
		int[] a = new int[3];
		// 배열을 선언함과 동시에 객체를 생성하여 초기화 하였다. 초기화 값은 0이다.
		a[0]=3;
		a[1]=4;
//		a[2]=5;
		
		// 배열 객체에서 값 꺼내기
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// 배열 객체 생성과 함께 값 넣기
		
		int[] b = new int[] {3,4,5};
		
//		int[] b;
//		b = new int[] {3,4,5};
		
		int[] c = {3,4,5};
		
//		int[] c; // 선언과 대입 분리가 불가능
//		c = {3,4,5};
		
		// 배열 생성 방법 세가지 총정리
		// 방법 1
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		int[] array2;
		array2 = new int[3];
		
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		// 방법 2
		int[] array3 = new int[] {3,4,5}; // 초기화를 생략
		
		int[] array4;
		array4 = new int[] {3,4,5};
		
		// 방법 3
		
		int[] array5 = {3,4,5};
		
		// 배열에서의 초기화 값 정리
		// int, long, short, char, byte - 0으로 초기화
		// boolean - false 로 초기화
		// float double - 0.0으로 초기화
		// 클래스.....null
		
		int value1;
//		System.out.println(value1); // 오류 초기값 없이 출력 불가능
		int[] value2;
//		System.out.println(value2); // 오류 초기값 없이 출력 불가능
		
		int value3 = 0; // 0으로 초기화하여 오류 미발생
		System.out.println(value3);
		
		int[] value4 = null; // null로 초기화 하여 오류 미발생
		System.out.println(value4);
		
		boolean[] array6 = new boolean[3];
		
		for(int i=0; i < array6.length;i++) {
			System.out.println(array6[i]);
		}

		for(boolean i : array6) {
			System.out.println(i);
		}
		
		
		// 배열 전체를 출력하는 간단 방법
		// Arrays.toString(배열)을 사용
		System.out.println(Arrays.toString(array6));


		
		
		
		
		
		
		
		
		
		
		
		
	}
}
