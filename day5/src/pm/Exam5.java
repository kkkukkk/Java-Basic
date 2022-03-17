package pm;

public class Exam5 {
	public static void main(String[] args) {
		// 문자열 연산
//		String str1 = "안녕"+"하세요"+"!";
//		System.out.println(str1);
//		
//		String str2 = "반갑";
//		str2 += "습니다";
//		str2 += "!";
//		System.out.println(str2);
		
		// String 객체는 내용을 변경할 수 없기 때문에 메모리에는
		// 각각의 객체가 매번 생성이 된다.
		// 처음 "안녕"+"하세요" 붙을 때 객체가 세롭게 만들어지고
		// "안녕하세요"+"!" 붙을 때 객체가 또 생성된다.
		// 최종적으로 마지막 객체의 위치값이 저장되게 된다.
		
		// 문자열 관련 메소드 정이
		
		// length() 문자열 길이
		String str1 = "Hello Java"; // 빈칸도 글자로 count한다.
		String str2 = "안녕하세요! 반갑습니다"; // 한글, 영어 모두 한 문자당 1개로 count한다.
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		// charAt() 문자열 검색
		System.out.println(str1.charAt(1)); //인덱스 1 위치의 문자를 검색
		System.out.println();
		
		// indexOf() 글자가 위치한 인덱스를 반환 lastIndexOf()
		System.out.println(str1.indexOf('a')); // 앞에서부터 첫 번째 등장하는 'a'가 위치한 인덱스
		System.out.println(str1.lastIndexOf('a')); // 뒤에서부터 첫 번쨰 등장하는 'a'가 위치한 인덱스
		System.out.println();
		
		// String.valueOf 기본자료형 -> 문자열 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		// concat() 문자열을 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		// 대소문자 변환
		String str6 = "Java Study";
		System.out.println(str6.toUpperCase());
		System.out.println(str6.toLowerCase());
		
		// replace 문자열 변경
		System.out.println(str6.replace("Study", "공부"));
		
		// substring 문자열에서 슬라이싱
		System.out.println(str1.substring(0,5)); // 0번쨰 부터 5 미만까지 슬라이싱
		
		// trim 여백 제거
		System.out.println("          austin        ".trim());
		
		// equals() 문자열의 내용 비교, 문자열을 비교할 때는 ==를 쓰지않는다
		
		
		
		
		
		
		
		
		
		
	}
}
