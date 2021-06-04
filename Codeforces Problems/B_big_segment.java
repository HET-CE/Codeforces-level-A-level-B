import java.util.ArrayList;
import java.util.Scanner;

public class B_big_segment {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            arr1.add(sc.nextInt());
            arr2.add(sc.nextInt());
        }
        
        int min = Integer.MAX_VALUE ,max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr1.size() ; i++){
            if(arr1.get(i) < min){
                min = arr1.get(i);
            }
            if(arr2.get(i) > max){
                max = arr2.get(i);
            }
        }

        boolean flag = true;
        for(int i = 0 ; i < arr1.size() ; i++){
            if(arr1.get(i) == min && arr2.get(i) == max){
                flag = false;
                System.out.println(i+1);
            }
        };
        if(flag)
            System.out.println("-1");
            sc.close(); }
}
