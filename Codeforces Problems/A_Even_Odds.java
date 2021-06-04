import java.util.Scanner;

public class A_Even_Odds {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long i = -1;
        while(true){
            if(k==0)
                break;
            k--;
            i += 2;
            if(i > n){
                i = 2;
            }
        }
        System.out.println(i);
        sc.close();
    }
}
