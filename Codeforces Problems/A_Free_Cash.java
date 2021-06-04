import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Free_Cash {

    static class Node {
        int a, b;

        public Node(int x, int y) {
            this.a = x;
            this.b = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Node> arr = new ArrayList<>(n);
        Set<Node> se = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(new Node(a,b));
            se.add(new Node(a,b));
        }

        for(int i = 0 ; i < se.size() ; i++){
        
        }
        sc.close(); }
}