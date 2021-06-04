import java.util.Scanner;
public class B_Appleman_and_Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        sc.nextLine();
        String str = sc.nextLine();
        long[] arr = new long[26];
        for(int i = 0 ; i < n ; i++){
            arr[str.charAt(i) - 'A']++;
        }

        long amount = 0;
        while(k >= 0){
            long max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for(int i = 0 ; i < 26 ; i++){
                if(arr[i] >= max){
                max = arr[i];
                maxIndex = i;
                }
            }
            // System.out.println( "  " + max + " " +k);
            if(max < 0)
                break;
            if( k-max < 0){
                amount += k*k;
                arr[maxIndex] = -1;
                break;
            }
            
            amount += max*max;
            k -= max;
            arr[maxIndex] = -1;
            // System.out.println(amount);
        }
        System.out.println(amount);
    }    
}