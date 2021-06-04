import java.util.Scanner;
 
public class B_Fence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int[] arr = new int[n];
 
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
 
        int min = Integer.MAX_VALUE;
        int sum = 0,l,index = 0;
        for(int j = 0 ; j <= n-k ; j++){
            sum = 0;
            for(l = j ; l <= j+k-1 ; l++){
                sum += arr[l];
            }
            if(sum < min){
                min = sum;
                index = j+1;
            }
        }
        System.out.println(index);
        sc.close();}
}
