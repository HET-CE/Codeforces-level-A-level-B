import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_Heist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
    
        for(int i = 0 ; i < n ; i++){
            arr.add(sc.nextInt());  
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr.get(i) > max)
                max = arr.get(i);
            if(arr.get(i) < min)
                min = arr.get(i);
        }

        Collections.sort(arr);

        int cn = 0;
        for(int i = min ; i <= max ; i++){
           if(!arr.contains(i))
                cn++;
        }
        System.out.println(cn);
        sc.close(); }    
}
