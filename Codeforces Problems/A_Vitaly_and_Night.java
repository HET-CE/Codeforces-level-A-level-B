import java.util.Scanner;

public class A_Vitaly_and_Night {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][2 * m];

        int cn = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; i++) {
                if (arr[i][2 * j] == 1 || arr[i][2 * j + 1] == 1) {
                   System.out.println(cn);
                    cn++;
                }
            }
        }
        System.out.println(cn);
        sc.close();
    }
}
