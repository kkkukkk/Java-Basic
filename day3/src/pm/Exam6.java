package pm;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("a 입력 >>> ");
//		int a = sc.nextInt();		
//		System.out.print("b 입력 >>> ");
//		int b = sc.nextInt();
//		
//		System.out.println(a>b ? "a가 크다" : a==b ? "같다" : "b가 크다");		
		
//		System.out.print("a 입력 >>> "); int a = sc.nextInt();		
//		System.out.print("b 입력 >>> "); int b = sc.nextInt();
//		System.out.print("c 입력 >>> "); int c = sc.nextInt();
//		
//		int min = 0;
//		if (a<b && a<c) {
//			min = a;
//		}else if (b<c) {
//			min = b;
//		}else {
//			min = c;
//		}
//		
//		int min = a<b && a<c ? a : b<c ? b : c;
//		
//		int min = a;
//		if(b<min) min = b;
//		if(c<min) min = c;
//
//		System.out.println("최소값은 " + min);
		
		System.out.print("a 입력 >>> "); int a = sc.nextInt();		
		System.out.print("b 입력 >>> "); int b = sc.nextInt();
		System.out.print("c 입력 >>> "); int c = sc.nextInt();
		
		int k = 0;
		if(a>b) {k = b; b = a; a = k;}
		if(b>c) {k = b; b = c; c = k;}
		if(a>b) {k = b; b = a; a = k;}
		
		System.out.println(a+","+b+","+c);
		
		
		
		
		
		
		
		
		
		
		
	}

}
