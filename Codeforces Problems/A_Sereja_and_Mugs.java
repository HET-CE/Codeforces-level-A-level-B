import java.util.Scanner;

public class A_Sereja_and_Mugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        if(sum-max <= s)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }    
}
