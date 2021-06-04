import java.util.Scanner;

public class A_Eshag_Loves_Big_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t != 0) {
            int n = sc.nextInt();
            int[] m = new int[1000];
            
            int mn = 200;
	        for (int i = 0; i < n; i++) {
		        int x;
                x = sc.nextInt();
		        mn = Math.min(mn, x);
		        m[x]++;
	        }
	        System.out.println(n - m[mn]);
            t--;
        }
        sc.close();
    }
}