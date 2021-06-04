import java.util.Scanner;

public class B_Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double num;
        for(int i = 1 ; i <= n ; i++){
            num = sc.nextInt();
            sum = sum + (num/100);
        }
        System.out.format("%.12f" ,(double)(sum/n*100));
        sc.close();}   
}
