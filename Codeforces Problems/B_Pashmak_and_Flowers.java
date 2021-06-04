import java.util.Arrays;
import java.util.Scanner;

public class B_Pashmak_and_Flowers {
    static boolean flag = true;
    static long cn = 0;
    static void noOfWays(long[] arr, int i, int n){
        if(i >= n){
            // System.out.println(cn);
            return;
        }
        if(arr[i] == arr[i+1] && arr[n-1] != arr[n-2]){
            cn = cn + 2;
            i++;
            flag = false;

        }
        else if(arr[i] != arr[i+1] && arr[n-1] == arr[n-2]){
            cn = cn + 2;
            n--;
            flag = false;

        }
        else if(arr[i] == arr[i+1] && arr[n-1] == arr[n-2]){
            cn = cn + 4;
            i++;
            n--;
            flag = false;

        }
        else if(arr[i] != arr[i+1] && arr[n-1] != arr[n-2]){
            // System.out.println(cn);
            if(flag)
                cn++;
            flag = false;
            return;
        }
        else{
            // System.out.println(cn);
            return;
        }
        noOfWays(arr,i,n);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr= new long[n];
        for(int i = 0; i< n ; i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long diff = arr[n-1] - arr[0];
        noOfWays(arr, 0, n);
        System.out.println(diff + " " + cn);
        sc.close(); }    
}
