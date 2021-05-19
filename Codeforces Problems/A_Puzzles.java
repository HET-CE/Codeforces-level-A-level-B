import java.util.Arrays;
import java.util.Scanner;

public class A_Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int temp ,diff;
        // int temp1,temp2,diff1,diff2;
        int[] arr = new int[m];
        for(int i = 0 ; i < m ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int diff = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(i+n-1 >= arr.length)
                break;
            if(arr[i+n-1] -arr[i] <= diff){
                diff = arr[i+n-1]-arr[i];
            }
        }
        System.out.println(diff);
        // if(Math.abs(n-m) %2 == 0 ){
        //     temp = Math.abs(n-m)/2;
        //     diff = arr[arr.length-1-temp] - arr[temp];
        //     System.out.println(diff);
        // }
        // else{
        //     temp1 = Math.abs(n-m)/2;
        //     temp2 = temp1+1;
        //     diff1 = arr[arr.length-1-temp1] - arr[temp2];
        //     diff2 = arr[arr.length-1-temp2] - arr[temp1];
        //     if(diff1 < diff2)
        //         System.out.println(diff1);
        //     else
        //         System.out.println(diff2);
        // }
    }    
}
