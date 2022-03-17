package pm;

import java.util.Arrays;

public class Exam6 {
	public static void main(String[] args) {
		
	// 문자열의 내용 비교 : 문자열을 비교할 때 절대 쓰지 말고 .equals()를 사용하자
//		String str2 = new String("Java");
//		String str3 = new String("Java");
//		String str4 = new String("java");
//		
//		System.out.println(str2 == str3);	   // 글자 자체와는 상관 없이 같은 메모리 주소인지 여부를 확인한다.
//		System.out.println(str3 == str4);
//		System.out.println(str2 == str4);
//		
//		System.out.println(str2.equals(str3)); // 메모리의 위치와는 관계 없이 글자 자체만을 비교한다.
//		System.out.println(str3.equals(str4));
//		System.out.println(str2.equalsIgnoreCase(str4)); // 대소문자와 상관없이 비교

//		int [] a = new int[] {1,2,3,4,5};
//		for(int i : a) {
//			System.out.println(i);
//		}
		
		int[][] b = {{1,3,5},{7,9}};
		
		for(int i = 0; i<b.length;i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
		String name = str.substring(str.indexOf("[")+1,str.indexOf("]"));
		int age = Integer.parseInt(str.substring(str.lastIndexOf("[")+1,str.lastIndexOf("]")));

		System.out.println(name);
		System.out.println(age);
	
		
		
		
		
	}	
}
