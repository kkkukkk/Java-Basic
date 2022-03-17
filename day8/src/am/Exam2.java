package am;

import java.util.ArrayList;

public class Exam2 {
	public static void main(String[] args) {
		// 배열, 반복, 조건,
		// 주석, 클래스, 객체
		
		// Q2 첫 수부터 숫자 2개씩을 더한 값이 
		K k = new K();
		
		int[] a = {1,3,4,5,6};
		
		k.print(a);
		
	}
}

class K {
	ArrayList<Integer> b = new ArrayList<>(); 
	void print(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if ((a[i]+a[i+1])%2 == 0) {
				b.add(i);
				b.add(i+1);
			}
		}
		System.out.println(b);
	}
}