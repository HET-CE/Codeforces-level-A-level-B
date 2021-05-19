import java.util.Scanner;

public class B_shower_Line {
    static int g[][] = new int[6][6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                g[i][j] = sc.nextInt();
        int p[] = new int[6];
        int pans[] = new int[6];
        int ans = -1, tmp;
        for (int i = 0; i < n; ++i)
            p[i] = i;

        do {
            // 01234
            tmp = g[p[0]][p[1]] + g[p[1]][p[0]];
            tmp += g[p[2]][p[3]] + g[p[3]][p[2]];

            // 1234
            tmp += g[p[1]][p[2]] + g[p[2]][p[1]];
            tmp += g[p[3]][p[4]] + g[p[4]][p[3]];

            // 234
            tmp += g[p[2]][p[3]] + g[p[3]][p[2]];

            // 34
            tmp += g[p[3]][p[4]] + g[p[4]][p[3]];

            if (tmp > ans) {
                ans = tmp;
                for (int i = 0; i < n; ++i)
                    pans[i] = p[i];
            }
        } while (next_permutation(p, p + n));

        System.out.println(ans);
    }
}
