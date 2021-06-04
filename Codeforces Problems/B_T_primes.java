import java.util.Scanner;
 
public class B_T_primes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        long num;
        long cn = 0;
        long temp ;
        long[] arr = new long[n];
        for(int i = 0; i < n ; i++){
            arr[i] =sc.nextLong();
        }
        for(int i = 0 ; i < n ; i++){
            num = arr[i];
            temp = 2;
            cn = 2;
            while( temp < (num)){
                if(num % temp == 0){
                    cn++;
                }
                if(cn == 4){
                    break;
                }
                temp++;
            }
            if(cn == 3){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
        sc.close(); }
}