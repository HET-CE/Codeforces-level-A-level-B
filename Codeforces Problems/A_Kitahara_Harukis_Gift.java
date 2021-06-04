import java.util.Scanner;

public class A_Kitahara_Harukis_Gift {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int sum1 = 0, sum2 = 0;
        if((sum/100) %2 != 0){
            System.out.println("NO");
        }
        else{
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == 200){
                    sum2 += arr[i];
                }
                else{
                    sum1 += arr[i];
                }
            }
            if(sum1 == sum2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close(); }
}
