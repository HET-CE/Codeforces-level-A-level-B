import java.util.Scanner;

public class A_Soft_Drinking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int num1 = k*l / nl;
        int num2 = c*d;
        int num3 = p/np;

        System.out.println((Math.min(Math.min(num1, num2),num3))/n);
    }
}