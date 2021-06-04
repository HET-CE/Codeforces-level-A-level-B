import java.util.Scanner;

public class Strange_table {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr;
        int t = sc.nextInt();
        int cn = 0;
        for(int i = 1 ; i <= t ; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int tar = sc.nextInt();
            arr = new int[n][m];
            cn = 0;
            for(int k = 0 ; k < m ;k++){
                for(int l = 0 ; l < n ; l++){
                    if(cn != tar)
                        cn++;
                }
            }
        }
        sc.close();
    }
}
