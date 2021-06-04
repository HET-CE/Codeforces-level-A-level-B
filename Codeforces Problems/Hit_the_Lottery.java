import java.util.Arrays;
import java.util.Scanner;

public class Hit_the_Lottery {
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 20, 100};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int ans = minBills(n, arr, dp);
        System.out.println(ans);
        sc.close();}

    static int minBills(int n, int[] arr, int[] dp){
        if(n == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(n-arr[i] >= 0){
                int subans;
                if(dp[n-arr[i]] != -1){
                    subans = dp[n-arr[i]];
                }
                else{
                    subans =  minBills(n-arr[i], arr, dp);
                }
                if(subans != Integer.MAX_VALUE && subans+1 < ans){
                    ans = subans +1;
                } 
            }
        }
        return dp[n] = ans;
    }
}
