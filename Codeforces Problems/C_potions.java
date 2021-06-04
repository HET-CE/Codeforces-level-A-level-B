import java.util.Arrays;
import java.util.Scanner;

public class C_potions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }   

        Arrays.sort(arr);

        int cn = 0, track = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            System.out.println(track);

            if(track + arr[i] >= 0){
                cn++;
                System.out.println("  " + cn);
                track += arr[i];
            }
            else
                break;
        }
        System.out.println(cn);
    }
}