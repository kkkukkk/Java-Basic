package am;

public class Exam2 {
    public static void main(String[] args) {
        //변수명 짓기
        int value1 = 3;
        {
            int value2 = 5;
        System.out.println(value1);
        System.out.println(value2);
        } // value2가 사라진다.
        System.out.println(value1);
        // System.out.println(value2); // 지역변수


        // 형변환, 캐스팅 casting
        
        float value5 = 1.2F; // 실수형 float은 F를 붙여서 표현한다.
        double value6 = 1.5;
        double value7 = 5; // 자동 형변환
        
        System.out.println(value7);

        int value8 = (int)5.3; // 수동 형변환
        System.out.println(value8);
        long value9 = (long)10L;

        // 형변환은 자바가 자동으로 수행하는 자동 형변환과 개발자가 직접 형 변환을 수행해야 하는 수동 형변환이 있다. 크기가 작은 자료형을 큰 자료형에 대입할 때는 어떤 손실도 발생하지 않는다.
        // 따라서 작은 자료형을 큰 자료형에 담으면 개발자가 변환 코들를 넣어주지 않아도 자바가 자동으로 타입을 변환해주는데 이것을 업캐스팅이라고 한다.

        // 정수형 자료형들과 그 크기
        

        







    }
}
