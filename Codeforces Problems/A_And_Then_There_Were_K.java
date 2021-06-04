import java.util.Scanner;

public class A_And_Then_There_Were_K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n ;
        for(int i = 1 ; i <= t ; i++){
            n = sc.nextInt();
            
            for(int j = n-1 ; j >= 0 ; j--){
                n = n & j;
                if((n) == 0){
                    System.out.println(j);
                    break;
                }
            }
        }
        sc.close(); 
    }
}
