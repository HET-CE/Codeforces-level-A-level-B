import java.util.Arrays;
import java.util.Scanner;

public class A_Business_trip {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        boolean flag = true;
        int[] arr = new int[12];
        for(int i = 0 ; i < 12 ; i++)
        {
            arr[i] = sc.nextInt();    
        }
        Arrays.sort(arr);
        int l = 11;
        while(k > 0){
            k -= arr[l];
            l--;
            if(l == -1 && (k != 0)){
                System.out.println("-1");
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(11 - l);
    }
}
