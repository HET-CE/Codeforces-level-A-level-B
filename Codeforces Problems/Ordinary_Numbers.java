import java.util.ArrayList;
import java.util.Scanner;

public class Ordinary_Numbers {
    static ArrayList<Integer> arr = new ArrayList<>();
    
    static void helper(int num){
        int rem ;
        while(num != 0){
            rem = num%10;
            arr.add(rem);
            num = num/10;
        }
        System.out.println(arr);
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        int num;
        for(int i = 1 ; i <= testCase ; i++){
            num = s.nextInt();
            helper(num);
        }
        s.close();
    }
}
