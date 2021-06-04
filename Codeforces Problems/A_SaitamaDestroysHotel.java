import java.util.ArrayList;
import java.util.Scanner;

public class A_SaitamaDestroysHotel {
    
    static class Node{
        int a,b;
        Node(int x,int y){
            this.a = x;
            this.b = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int floor = sc.nextInt();
        
        ArrayList<Node> arr = new ArrayList<>();
        arr.add(new Node(floor, n));
        int temp1, temp2;
        for(int i = 0 ; i < n ; i++){
            temp1 = sc.nextInt();
            temp2 = sc.nextInt();
            arr.add(new Node(temp1,temp2));
        }
        for(int i = 1 ; i < arr.size() - 1 ; i++){
            for(int j = i+1 ; j < arr.size() ; j++){
                if(arr.get(i).a < arr.get(j).a){
                    Node temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    
                }
            }
        }

        // for(int i = 0 ; i < arr.size() ; i++){
        //     System.out.println("  " + arr.get(i).a + " " + arr.get(i).b);
        // }

        int time = 0,tempdiff;
        for(int i = 0 ; i < arr.size() - 1 ; i++){
            int diff = arr.get(i).a - arr.get(i+1).a;
            tempdiff = diff + arr.get(i+1).b;
            time += diff;
            // System.out.println("    " + time);
            
            Node tempp = new Node(arr.get(i+1).a, arr.get(i+1).b - time);
            if( tempp.b < 0)
                tempp.b = 0;
            arr.set(i+1, tempp);
            
            time += arr.get(i+1).b;
            // System.out.println("     " + time);
        }
        time += arr.get((arr.size() - 1)).a;
        System.out.println(time);
    }    
}
