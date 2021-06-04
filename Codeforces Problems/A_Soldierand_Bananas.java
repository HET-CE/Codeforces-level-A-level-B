import java.util.Scanner;

public class A_Soldierand_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();

        long sum = 0;
        for(int i = 1 ; i <= w ; i++){
            sum += i*k;
        }
        if(sum-n > 0)
            System.out.println(sum-n);
        else
            System.out.println("0");
    }
}
