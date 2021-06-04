import java.util.Scanner;

public class A_Wizards_Duel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        
        if(l*p % (p+q) == 0)
            System.out.println(l*p / (p+q));
        else
            System.out.println((float)l*p / (p+q));
    }
}