import java.util.Arrays;
import java.util.Scanner;
public class A_Cut_Ribbon {
    
    static int cn = 0,res = 0;
    static boolean flag = true;
    static void solve(int n, int a, int b, int c){
        cn++;
        if(n < c){
            cn--;
            return;
        }        
        solve(n - c, a, b, c);
        if((n == a || n == b || n == c) && flag){
            if(cn > res)
                res = cn;
            flag = false;
        }
        else
            cn--;

        if(n < 1000){
            cn = 1;
            flag = true;
            solve(n-b,a,c,b);
            cn = 1;
            flag = true;
            solve(n-a,c,b,a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];

        for(int i = 0 ; i < 3 ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        solve(n,arr[2],arr[1],arr[0]);

        System.out.println(res);
        sc.close();
    }
}
