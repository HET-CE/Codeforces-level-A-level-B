import java.util.Scanner;

public class A_GukiZ_and_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] arr2 = new long[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        long cn = 1;
        for(int i = 0 ; i < n ; i++){
            cn = 1;
            for(int j = 0 ; j < n ; j++){
                if(arr[j] > arr[i]){
                    cn++;
                }
            }
            // System.out.print(cn + " ");
            arr2[i] = cn;
        }
        // System.out.println();
        for(long i : arr2)
            System.out.print(i+" ");
    }
}
