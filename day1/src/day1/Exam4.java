package day1;

public class Exam4 {
	public static void main(String[] args) {

		char value1 = 'A';
		char value2 = '가';
		char value3 = '3'; // 숫자가 아닌 문자 3

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();

		// 숫자로 문자 저장

		char value4 = 65;
		System.out.println(value4);
		System.out.println();

		// 유니코드로 문자 저장

		char value5 = '\u0065';
		System.out.println(value5);
		System.out.println();

		// 형변환 type casting

		int value11 = (int) 5.3;

		System.out.println(value11);

		// 자동 형변환

		float value21 = 3; // int -> float 업캐스팅
		long value22 = 5; // int -> long 업캐스팅

		// int value27 = 3.5; // double -> int 다운캐스팅(x)
		int value28 = (int) 3.5;
		// float value29 = 7.5; // 실수의 기본은 double 형이다.
		float value30 = (float) 7.5;

		float value31 = 2.453214321F;

		// 자료형 간의 연산

		int value41 = 3 + 5;
		int value42 = 8 / 5;
		float value43 = 3.0f + 5.0f;
		double value44 = 8.0 / 5.0;

		byte data1 = 3;
		byte data2 = 5;
		// byte data3 = data1+data2; // 결과가 int로 나온다.
		int data4 = data1 + data2;

		// int value45 = 5+3.5; // 결과가 double이므로 오류
		double value46 = 5 + 3.5;

		double value48 = 5 / 2.0;
		byte data13 = 3;
		short data14 = 5;
		int value49 = data13 + data14;
		double value50 = data13 + data14; // int를 double로 자동 형변환

		// quiz 1

//1		int a = 3;
//2		{
//3			int b;
//4			b=5;
//5		}
//6		int c = 7;

		
	}

}
