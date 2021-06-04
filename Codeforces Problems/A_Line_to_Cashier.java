import java.util.Scanner;

public class A_Line_to_Cashier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0,min = Integer.MAX_VALUE,temp;
        for(int i = 0 ; i < n ; i++){
            sum = 0;
            for(int j = 0 ; j < arr[i] ; j++){
                temp = sc.nextInt();
                sum += temp*5;
            }
            sum += 15*arr[i];
            // System.out.println("  " + sum);
            if(sum < min){
                min = sum;
            }
        }
        System.out.println(min);
    }    
}
