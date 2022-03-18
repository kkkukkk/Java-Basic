package am;

public class Exam3 {
    public static void main(String[] args) {
        int a = 3;
        ++a; //전위형
        System.out.println(a);

        int b = 3;
        b++; // 후위형
        System.out.println(b);    // b=b+1; b += 1;

        a = 5;
        if (a%2 == 0){
            System.out.println("짝수입니다.");
        }else if (a%2 != 0){
            System.out.println("홀수입니다.");
        }else{
            System.out.println("0입니다.");
        }
        
    }



}
