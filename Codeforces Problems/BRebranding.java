import java.util.Scanner;

public class BRebranding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("  " + n);
        int m = sc.nextInt();
        // System.out.println("  " + m);
        sc.nextLine();
        String s = sc.nextLine();
        // System.out.println("  " + s);

        char a,b;
        for(int i = 0 ; i < m ; i++){
            a =  sc.next().charAt(0);
            // System.out.println("      " + a);
            b =  sc.next().charAt(0);
            // System.out.println("      " + b);

            s = s.replace(a , '@');
            // System.out.println(" " + s);
            s = s.replace(b, a);
            // System.out.println(" " + s);
            s = s.replace('@', b);
            // System.out.println(" " + s);
        }
        System.out.println(s);
    }
}