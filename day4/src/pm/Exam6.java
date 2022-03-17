package pm;

import java.util.Arrays;

public class Exam6 {
	public static void main(String[] args) {
						   // 여러개의 String 객체를 묶어 저장한다.
		// 배열의 특징
		// 참조 자료형 변수를 복사하면 실제 데이터가 복사되는 것이 아니라
		// 실제 데이터의 위치값이 복사된다.
		
//		int[] a = {3,4,5};
//		int[] b = a;
//		b[0] = 7;
//		System.out.println(a[0]);
//		System.out.println(b[0]);
		
		// 하나의 참조변수를 이용해서 데이터를 수정하면
		// 다른 참조변수가 가리키는 데이터도 변하게 된다.
		// 배열의 길이
		// .length
		
//		int[] a = new int[] {3,4,5,6,7};
//		System.out.println(a.length);
//		
//		for(int i = 0; i < a.length ; i++) {
//			System.out.println(a[i]);
//		}
//		
//		for (int i : a) {
//			System.out.print(i);
//		}
	
		
		// 2차원 배열
		// 가로와 세로 2차원으로 데이터를 저장하는 배열
		// 자료형[][] 변수명;   자료형 변수명[][];   자료형[] 변수명[];
		// 배열의 선언을 보면 차원이 1개씩 늘어날 때마다 대괄호가 1개씩 늘어난다.
		// 배열의 위치 표현은 세로 방향으로 숫자가 늘어나는 행 row 번호
		// 가로 방향으로 숫자가 늘어나는 열 column 번호로 구성된다.
		
		
//		int[][] array1 = new int[3][4];
//		int[][] array2;
//		array2 = new int[3][4];
//		
//		//2차원 배열 생성 방법2
//		int array3[][] = new int[3][4];
//		int array4[][];
//		array4 = new int[3][4];
//		
//		//2차원 배열 생성 방법3
//		int[] array5[] = new int[3][4];
//		int[] array6[];
//		array6 = new int[3][4];
		
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		System.out.println(array1[0][0]);
		
		int[][] a = {{1,2},{3,4,5}};
		
		for(int i = 0; i<a.length;i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		for (int[] e : a) {
			for (int f : e) {
				System.out.print(f + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
