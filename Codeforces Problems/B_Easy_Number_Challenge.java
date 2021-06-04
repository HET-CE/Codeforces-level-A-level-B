import java.util.Scanner;

public class B_Easy_Number_Challenge {
    
    static int noOfDivisor(long s){
        int cn = 2;
        if(s == 1)
            return 1;
        for(int i = 2 ; i <= s/2 ; i++){
            if(s % i == 0)
                cn++;
        }
        return cn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        int sum = 0;
        for(long i = 1 ; i <= a ; i++){
            for(long j = 1 ; j <= b ; j++){
                for(long k = 1; k <= c ; k++){
                    sum = sum + noOfDivisor(i*j*k);
                }
            }
        }
        System.out.println(sum);
        sc.close(); }
}
