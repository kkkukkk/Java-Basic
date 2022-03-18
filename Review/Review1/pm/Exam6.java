package pm;

public class Exam6 {
    public static void main(String[] args) {
        
        int cnt = 0;
        for (int i = 1; i<101; i++){
            int a = i/10;
            int b = i%10;
            String c = Integer.toString(a);
            String d = Integer.toString(b);
            if (d.equals("3") || d.equals("6") || d.equals("9")){
                if(c.equals("3") || c.equals("6")||c.equals("9")){
                    System.out.print("aa\t");
                }else{
                    System.out.print("a\t");
                }
            }else if(c.equals("3") || c.equals("6")||c.equals("9")){
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





    }
}
