import java.util.Scanner;

public class B_Hungry_Sequence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        int j = 3;
        System.out.print(i + " " +j + " ");
        int m;
        for(int k = 3; k <= n ; k++){
            System.out.print((i+j) + " ");
            m = i+j;
            i = j ;
            j = m;
        }
    }
}
