import java.util.Scanner;

public class Do_Not_Be_Distracted {

    static void solve() {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String s;
        s = sc.nextLine();
        for (char c = 'A'; c <= 'Z'; c++) {
            int first = n;
            int last = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    first = Math.min(first, i);
                    last = Math.max(last, i);
                }
            }
            for (int i = first; i <= last; i++) {
                if (s.charAt(i) != c) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        s.nextLine();
        while (t-- != 0) {
            solve();
        }
    }

}