import java.util.Scanner;

public class A_System_f_Equations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cn = 0;
        int a = 0 ,b = 0;
        while(a <= n){
            b = n - (a*a);
            if((a + b*b == m) && (a*a + b == n) && (a >= 0) && (b >= 0)){     
                cn++;
            }
            a = a + 1;
        }
        System.out.println(cn);
        sc.close(); }
}