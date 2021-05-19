import java.util.ArrayList;
import java.util.Scanner;

public class A_Football {
    
    static class Node{
        int n;
        String str;
        Node(String s,int n){
            this.n = n;
            this.str = s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
    
        ArrayList<Node> arr = new ArrayList<>();

        int cn = 1;
        int n1=1,n2=1;
        for(int i = 0; i < n ; i++){
            String str = sc.nextLine();
            Node node = new Node(str,cn);
            if(!arr.contains(node)){
                arr.add(node);
            }
            if(arr.contains(node)){
                node.n++;
            }
        }
        for(Node e:arr){
            System.out.println(e.n + "  " + e.str);
        }
        if(arr.get(0).n > arr.get(1).n){
            System.out.println(arr.get(0).str);
        }
        else{
            System.out.println(arr.get(1).str);
        }
    }
}
