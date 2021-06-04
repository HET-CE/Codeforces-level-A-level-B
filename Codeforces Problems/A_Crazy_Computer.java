import java.util.Scanner;

public class A_Crazy_Computer{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int a = sc.nextInt();
        int b;
        int cn = 1;
        for(int i = 1 ; i < n ; i++){
            b = sc.nextInt();
            if(b-a>c)
                cn = 1;
            else
                cn++;
            a = b;
            // System.out.println(cn);
        }
        System.out.println(cn);
    }
}
