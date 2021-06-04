import java.util.Scanner;

public class A_Rewards {

    static void solve(int a1,int a2,int a3, int b1,int b2,int b3,int n){
        
        int sumCups = a1+a2+a3;
        int sumMedals = b1+b2+b3;

        if((float)sumCups/5 > n){
            System.out.println("NO");
            return;
        }
        else
            n = (n -  (int)Math.ceil((float)sumCups/5));

            // System.out.println(" "+n);
        
            if((float)sumMedals/10 > n){
            System.out.println("NO");
            return;
        }
        else
            System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int n = sc.nextInt();

        solve(a1,a2,a3,b1,b2,b3,n);
    }
    
}
