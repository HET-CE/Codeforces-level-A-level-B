import java.util.ArrayList;
import java.util.Scanner;

public class A_Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList(4);
        int cn = 0;
        for(int i = 0 ; i < 4 ; i++){
            int n = sc.nextInt();
            if(arr.contains(n))
                cn++;
            else
                arr.add(n);
        }
        System.out.println(cn);
        sc.close(); }    
}
