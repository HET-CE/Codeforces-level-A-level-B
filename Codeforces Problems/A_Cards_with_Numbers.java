import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A_Cards_with_Numbers {
    
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];

        for(int i = 0 ; i < 2*n ; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < 2*n ; i++){
            for(int j = i+1 ; j < 2*n ; j++){
                if(arr[i] == arr[j]){
                    System.out.println((j+1) + " " + (i+1));
                    break;
                }
            }
        }

        sc.close();
    }
}
