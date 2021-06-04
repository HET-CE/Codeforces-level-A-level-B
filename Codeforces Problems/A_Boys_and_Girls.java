import java.util.Scanner;

public class A_Boys_and_Girls {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == m) {
            for (int i = 1; i <= n; i++) {
                System.out.print("BG");
            }
        } 
        else {
            for (int i = 1; i <= Math.min(n, m); i++) {
                if(n > m )
                    System.out.print("BG");
                else{
                    System.out.print("GB");
                }
            }

            for (int i = 1; i <= Math.abs(n - m); i++) {
                if (n > m)
                    System.out.print("B");
                else
                    System.out.print("G");
            }
        }
        sc.close();
    }
}
