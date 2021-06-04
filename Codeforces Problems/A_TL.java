import java.util.ArrayList;
import java.util.Scanner;

public class A_TL {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(m);

        int max = Integer.MIN_VALUE;
        int temp;
        for(int i = 0 ; i < n ; i++){
            temp = sc.nextInt();
            if(temp > max)
                max = temp;
        }
        for(int i = 0 ; i < m ; i++){
            arr.add(sc.nextInt());
        }
        if(!arr.contains(max+1))
            System.out.println(max+1);
        else
            System.out.println("-1");
            sc.close(); }
}
