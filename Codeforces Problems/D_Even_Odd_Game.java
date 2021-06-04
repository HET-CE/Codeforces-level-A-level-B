import java.util.Scanner;

public class D_Even_Odd_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int even_sum = 0;
            int odd_sum = 0;
            
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            if (even_sum > odd_sum)
                System.out.println("Alice");
            else if (even_sum == odd_sum)
                System.out.println("Tie");
            else
                System.out.println("Bob");
        }
        sc.close();}
}
// 4
// 4
// 5 2 7 3
// 3
// 3 2 1
// 4
// 2 2 2 2
// 2
// 7 8
