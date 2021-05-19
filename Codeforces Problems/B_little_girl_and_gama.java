import java.util.Scanner;

public class B_little_girl_and_gama {

    static int amt[] = new int[30];
    static int tot;
    static int count_odd = 0;

    static void solve(String str) {

        int L = str.length();
        for (int i = 0; i < L; i++) {
            amt[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (amt[i] % 2 == 1)
                count_odd++;
        }
        if (count_odd == 0) {
            System.out.println("First");
            return;
        }
        if (count_odd == 1) {
            System.out.println("First");
            return;
        }
        if (count_odd % 2 == 0) {
            System.out.println("Second");
            return;
        }
        System.out.println("First");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solve(str);
    }
}