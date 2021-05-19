import java.util.Scanner;

public class A_The_number_of_positions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = n - a;
        
        int sub;
        if(ans - b > 0){
        sub = ans - b;
        ans = ans - sub + 1;
        }
        System.out.println(ans);
    }
}
