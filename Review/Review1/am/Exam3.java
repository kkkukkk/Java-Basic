package am;

public class Exam3 {
    public static void main(String[] args) {
        int a = 3;
        ++a; //������
        System.out.println(a);

        int b = 3;
        b++; // ������
        System.out.println(b);    // b=b+1; b += 1;

        a = 5;
        if (a%2 == 0){
            System.out.println("¦���Դϴ�.");
        }else if (a%2 != 0){
            System.out.println("Ȧ���Դϴ�.");
        }else{
            System.out.println("0�Դϴ�.");
        }
        
    }



}
