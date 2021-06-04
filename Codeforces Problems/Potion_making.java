import java.util.Scanner;

public class Potion_making {
    
    static int gcd(int a, int b)
    {
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        if (a == b)
            return a;
      
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int k; 
	    while (t-- != 0) {
            k = sc.nextInt();    
		    System.out.println(100 / gcd(100, k));
	    }
        sc.close();
    }
}
