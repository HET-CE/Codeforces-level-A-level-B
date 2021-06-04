import java.util.Scanner;

public class A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num ;
        int cn = 0, ans = 0;
        for(int i = 0 ; i < n ; i++){
            cn = 0;
            for(int j = 0 ; j < 3 ; j++){
                num  = sc.nextInt();
                if(num == 1)
                    cn++;
            }
            if(cn >= 2)
                ans++;
        }
        System.out.println(ans);
        sc.close(); }
}
