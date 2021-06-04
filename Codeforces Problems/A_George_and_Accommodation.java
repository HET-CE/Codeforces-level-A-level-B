import java.util.Scanner;

public class A_George_and_Accommodation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cn = 0,a,b;
        for(int i = 0 ; i < n ;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            if(b-a >= 2)
                cn++;
        }
        System.out.println(cn);
    }
}
