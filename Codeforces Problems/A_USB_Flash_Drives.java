import java.util.Arrays;
import java.util.Scanner;

public class A_USB_Flash_Drives{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int max,cn=0;
        while(true){
            if(m <= 0)
                break;
            max = maxi(arr);
            int p = 0;
            while(true){
                if(arr[p] == max){
                    arr[p] = -1;
                    break;
                }
            p++;
            }
            m = m - max;
            cn++;
        }
        System.out.println(cn);
   
        sc.close(); }

    static int maxi(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}

// 3
// 5
// 2
// 1
// 3
