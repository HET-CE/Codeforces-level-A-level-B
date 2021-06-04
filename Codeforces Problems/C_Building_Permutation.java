import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_Building_Permutation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(n);

        for(int i = 0 ; i < n ; i++){
            arr.add(sc.nextInt());            
        }

        Collections.sort(arr);

        // for(int i = 0 ; i < n ; i++){
        //     System.out.println(arr.get(i));
        // }


        long op = 0;
        long temp = 1;
        for(int i = 0 ; i < n ; i++){
            op = op + Math.abs((temp - (arr.get(i))));
            temp++;
        }

        System.out.println(op);
        sc.close(); }
}
