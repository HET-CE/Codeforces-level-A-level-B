import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_sereja_and_suffixes {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>(n);

    for(int i = 0 ; i < n ; i++){
        arr.add(sc.nextInt());
    }
    
    Set<Integer> s = new HashSet<>();

    int temp;
    for(int i = 0 ; i < m ; i++){
        temp = sc.nextInt();
        for(int j = temp-1 ; j < n ; j++){
            s.add(arr.get(j));
        }
        System.out.println(s.size());
        s.clear();
    }
    sc.close();}
}
     