import java.util.ArrayList;
import java.util.Scanner;

public class A_Rank_List {

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
        int k = sc.nextInt();
        ArrayList<Node> arr = new ArrayList<>(n);

        Node A;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            A = new Node(x, y);
            arr.add(A);
        }

        Node temp,temp2 ;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).a < arr.get(j).a) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
                if (arr.get(i).a == arr.get(j).a) {
                    if(arr.get(i).b > arr.get(j).b){
                    temp2 = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp2);
                    }
                }
            }
        }

        // for(Node i : arr){
        //     System.out.println("  " + i.a + "  " + i.b);
        // }

        Node res = arr.get(k-1);

        int cn=0;
        for(Node i : arr){
            if(i.a == res.a && i.b == res.b)
                cn++;
        }

        System.out.println(cn);
        sc.close();
    }
}