import java.util.Scanner;

public class A_Circle_Line {
    
    static int solve(int a, int b, int[] arr){
        int res = 0;
        for(int i = a-1 ; i != b-1 ; i++){
            if(i == arr.length)
                i = 0;
            if(i == b-1)
                break;
            res += arr[i];
            // System.out.println(res);
        }
        // System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int dis1 = sc.nextInt();
        int dis2 = sc.nextInt();

        // System.out.println( "  " + dis1);
        // System.out.println( "  " + dis2);

        int res1 = solve(dis1,dis2,arr);
        int res2 = solve(dis2,dis1,arr);
        if(res1 < res2){
            System.out.println(res1);
        }
        else{
            System.out.println(res2);
        }
    }
}
