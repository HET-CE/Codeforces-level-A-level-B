import java.util.Scanner;

public class A_Panoramixs_Prediction {
    
    static boolean prime(int n){
        for(int i = 2 ; i < n ; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime(int n, int m){
        if(!prime(m))
            return false;
        for(int i = n+1 ; i < m ; i++){
            if(prime(i))
               return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(isPrime(n,m)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
            sc.close(); }
}
