import java.util.Scanner;

public class A_Cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cn = 0;
        int cnlz = 0, cnlf = 0, cnrz = 0, cnrf = 0;
        for (int i = 1; i <= n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l == 1)
                cnlf++;
            if (l == 0)
                cnlz++;
            if (r == 0)
                cnrz++;
            if (r == 1)
                cnrf++;
        }
        if ((cnlz == 0 || cnlf == 0) && (cnrz == 0 || cnrf == 0)) {
            System.out.println("0");
        }
        else if (cnlz == 0 || cnlf == 0) {
            if (cnrz < cnrf)
                System.out.println(cnrz);
            else
                System.out.println(cnrf);
        }
        else if (cnrz == 0 || cnrf == 0) {
            if (cnlz < cnlf)
                System.out.println(cnlz);
            else
                System.out.println(cnlf);
        }
        else {
            if(cnlz < cnlf)
                cn = cn + cnlz;
            else
                cn = cn + cnlf;
            if(cnrz < cnrf)
                cn = cn + cnrz;
            else
                cn = cn + cnrf;   
            System.out.println(cn); 
        }
   
        sc.close(); }
}
// if((cnlz != 0 || cnlf != 0 ) && (cnrz != 0 || cnrf != 0))