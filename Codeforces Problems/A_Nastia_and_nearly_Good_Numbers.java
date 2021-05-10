import java.util.Scanner;

public class A_Nastia_and_nearly_Good_Numbers {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        long q;
            
        q = sc.nextInt();
        
        while (q-- != 0) {
            long a, b; 
            a = sc.nextLong();
            b = sc.nextLong();
            if (b == 1) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                System.out.println(a + " " + a*b + " " + a*(b+1));
            }
        }
    }
}
