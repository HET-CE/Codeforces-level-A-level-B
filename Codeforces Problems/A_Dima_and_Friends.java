import java.util.Scanner;

public class A_Dima_and_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += sc.nextInt();
        }        
        int ans = sum % (n+1);
        if(n == 1 && ans == 1)
            System.out.println(ans+2);
        else if(ans == 1)
            System.out.println("1");
        else if(ans == 0)
            System.out.println("2");
        else
            System.out.println("1");
    }    
}
