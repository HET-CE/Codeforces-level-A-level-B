import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A_Jzzhu_and_Children {

//   wrong he

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Queue arr = new LinkedList<Integer>();
        for(int i = 0 ; i < n ; i++){
            arr.add(sc.nextInt());
        }
        int index = arr.size();
        int size = arr.size();
        int i = 0;
        while(!arr.isEmpty()){

            int ele = (int)arr.peek()-m;
            if(ele <= 0){
                arr.remove();
            }
            else{
                index = i+1;                
                arr.add(ele);
                arr.remove();
            }
            i++;
        }
        System.out.println(index);
        sc.close(); }
}
