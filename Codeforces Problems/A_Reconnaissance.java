import java.util.Arrays;
import java.util.Scanner;

public class A_Reconnaissance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min1 = 0;
        int min2 = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) < diff) {
                min1 = i;
                min2 = i+1;
                diff = Math.abs(arr[i] - arr[i+1]);
            }            
        }
        if(Math.abs(arr[0]-arr[arr.length-1]) < diff){
            min1 = arr.length-1;
            min2 = 0; 
        }           
            System.out.println((min1+1) + " " + (min2+1));
            sc.close(); }
}