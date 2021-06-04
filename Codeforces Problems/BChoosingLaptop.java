import java.util.ArrayList;
import java.util.Scanner;

public class BChoosingLaptop{
    
    static class Node{
        int w,x,y,z;
        Node(int a, int b, int c, int d){
            this.w = a;
            this.x = b;
            this.y = c;
            this.z = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1,t2,t3,t4;

        Node res = null;

        ArrayList<Node> arr = new ArrayList<>();
        ArrayList<Node> copy = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            t1 = sc.nextInt();
            t2 = sc.nextInt();
            t3 = sc.nextInt();
            t4 = sc.nextInt();
            arr.add(new Node(t1,t2,t3,t4));
            copy.add(new Node(t1,t2,t3,t4)); 
        }

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr.get(i).z > arr.get(j).z){
                    Node temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }

        // for(Node p : arr)
        //     System.out.println("       " +p.w + " " + p.x + " " + p.y + " " + p.z);

        boolean flag = true;
        for(int i = 0 ; i < n - 1 ; i++){
            flag = true;
            for(int j = i+1; j < n ; j++){
                if(arr.get(i).w < arr.get(j).w && arr.get(i).x < arr.get(j).x && arr.get(i).y < arr.get(j).y){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res = arr.get(i);
                break;
            }
        }
        if(n == 1){
            System.out.println("1");
        }        
        else {
            for(int i = 0 ; i < n ; i++){
                if(copy.get(i).w == res.w && copy.get(i).x == res.x && copy.get(i).y == res.y && copy.get(i).z == res.z){
                    System.out.println(i+1);
                }
            }
        }
    }
}