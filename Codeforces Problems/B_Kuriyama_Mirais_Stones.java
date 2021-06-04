import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class B_Kuriyama_Mirais_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
 
        PriorityQueue<Long> pq = new PriorityQueue<>();
 
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextLong();
            pq.add(arr1[i]);
        }
        for(int i = 0 ; i < n ; i++){
            arr2[i] = pq.peek();
            pq.remove();
        }
 
 
        long m = sc.nextLong();
        long sum = 0;
        int l ,r,type;
        for(int i = 0 ; i < m ; i++){
            type = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            sum = 0;
            if(type == 1){
                for(int j = l-1 ; j < r ; j++){
                    sum += arr1[j];
                }
                System.out.println(sum);
            }
            if(type == 2){
                for(int j = l-1 ; j < r ; j++){
                    sum += arr2[j];
                }
                System.out.println(sum);
            }
        }
        sc.close(); }
}