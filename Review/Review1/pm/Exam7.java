package pm;

public class Exam7 {
    public static void main(String[] args) {
        // other version
        int cnt = 0;
        for (int i = 1; i<101; i++){
            int a = i/10;
            int b = i%10;
            if (b%3 == 0 && b !=0){
                if(a%3 == 0 && a !=0){
                    System.out.print("aa\t");
                }else{
                    System.out.print("a\t");
                }
            }else if(a%3 == 0 && a !=0){
                System.out.print("a\t");
            }else{
                System.out.print(i+"\t");
            }
            cnt++;
            if (cnt==10){
                System.out.println();
                cnt = 0;
            }
        }


        // 배열 생성
        int[] arr1 = new int[3];
        int[] arr2;
        arr2 = new int[3];

        String[] str1 = new String[3];
        // 배열 값 넣기
        arr1[0] = 1;
        arr1[1] = 2;
        str1[0] = "hi";

        String[] str2 = {"hi","Hello"};

        for (String each : str2){
            System.out.println(each);
        }









    }
}
