package pm;

public class Exam5 {
    public static void main(String[] args) {
        
        // int x = -10;
        // switch((int)Math.signum(x)){
        //     case -1: System.out.println(x+" is negative number"); break;
        //     case 1: System.out.println(x+" is positive number"); break;
        //     default: System.out.println(x+" is zero");
        // }

        // for (int i=0; i<6; i++){
        //     System.out.print(i+" ");
        //     System.out.println();
        // }

        // int n = 0;
        // while(n<6){
        //     System.out.print(n+" "); n++;
        // }

        // int d = 9;
        // int t = 9;
        // for(int i = 1; i<d+1; i++){
        //     for(int j = 1; j<t+1; j++){
        //         System.out.println(i+"x"+j+"="+i*j);
        //     }
        //     System.out.println();
        // }

        int p = 1;
        while(p<10){
            int q=1;
            while(q<10){
                System.out.println(p+"x"+q+"="+p*q);
                q++;
            }
            System.out.println();
            p++;
        }




    }
}
