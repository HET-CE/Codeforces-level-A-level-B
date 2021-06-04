import java.util.Scanner;

public class A_Two_Bags_of_Potatoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextInt();
        long k = sc.nextInt();
        long n = sc.nextInt();
        long init = 0;
        boolean flag = true;
        long i;

        for (i = 1; i <= n; i++) {
            if ((i + y) % k == 0 && (i + y) <= n) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("-1");
        else {
            while (i + y <= n) {
                System.out.print((i) + " ");
                i += k;
            }
        }
        sc.close(); }
}
