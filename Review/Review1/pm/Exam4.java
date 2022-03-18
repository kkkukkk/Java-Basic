package pm;

public class Exam4 {
    // 제어문
    // 기본적으로 소스코드는 위에서부터 아래로 차례대로 1줄씩 처리된다.
    // 프로그램의 흐름을 의도적으로 바꿔야 할 필요가 있다.
    // 이 때 사용되는 것이 제어문이다.
    
    // 즉 제어문은 '프로그램의 처리, 순서를 바꾸는 것이다.'
    // 자바에서는 5개의 제어문과 2개의 제어 키워드

    public static void main(String[] args) {
        
        
        // if (x==0){
        //     System.out.println(x+"는 0입니다.");
        // }else if(x>0){
        //     System.out.println(x+"는 양의 정수입니다.");
        // }else{
        //     System.out.println(x+"는 음의 정수입니다.");
        // }
        int x = -10;
        switch((int)Math.signum(x)){
            case -1: System.out.println(x+" is negative number"); break;
            case 1: System.out.println(x+" is positive number"); break;
            default: System.out.println(x+" is zero");
        }
    }
}
