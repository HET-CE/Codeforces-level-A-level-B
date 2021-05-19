import java.util.Scanner;

public class A_Little_Elephant_and_Function {
    
    static void solve(int n){
        if( n == 1){
            System.out.print(1+" ");
            return;
        }
        System.out.print(n+" ");
        solve(n-1);
        // int a = n,b=n-1;
        // int temp = a ;
        // a = b;
        // b = temp;
        // System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
}
