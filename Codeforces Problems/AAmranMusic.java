import java.util.ArrayList;
import java.util.Scanner;

public class AAmranMusic {

    static class Node {
        int a, b;

        Node(int x, int y) {
            this.a = x;
            this.b = y;
        }
    }

    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        ArrayList<Node> p = new ArrayList<>();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            p.add(new Node(temp, i + 1));
        }
        Node tempNode;
        for (int i = 0; i < p.size() - 1; i++) {
            for (int j = i + 1; j < p.size(); j++){
                if (p.get(i).a > p.get(j).a) {
                    tempNode = p.get(i);
                    p.set(i, p.get(j));
                    p.set(j, tempNode);
                }
            }
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(p.get(i).a + " " + p.get(i).b);
        // }

        int j = 0;

        int cn = 0;
        while (true) {
            if (k - p.get(j).a >= 0) {
                k = k - p.get(j).a;
                cn++;
                j++;
            }
            if (j == n || k == 0 || k - p.get(j).a < 0) {
                break;
            }
        }
        System.out.println(cn);

        for (int i = 0; i < cn; i++) {
            System.out.print(p.get(i).b + " ");
        }
        sc.close();
    }
}