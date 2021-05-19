import java.util.Scanner;

public class A_Hexadecimal_theorem {
    
    static void solve(int n){
        for(int i = 1 ; i < n ; i++){
            for ( int j = 1 ; j< n ; j++){
                for (int k = 1 ; k < n ; k++){
                        if(i+j+k == n){
                            System.out.println(i +" "+j+" "+k);
                            return;
                    }

                }
            }
        }
        System.out.println("I'm too stupid to solve this problem");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
}
