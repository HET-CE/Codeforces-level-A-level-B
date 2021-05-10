import java.util.Scanner;

public class New_Year_and_Hurry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        int min_time = 240 - time;
        int cn = 0;

        int total = 0;
        for (int i = 1; i <= n; ++i) {
            total += 5 * i;
            System.out.println(total);
            cn++;
        }
        System.out.println(cn-1);
    }
}
