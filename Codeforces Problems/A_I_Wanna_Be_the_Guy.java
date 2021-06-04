import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_I_Wanna_Be_the_Guy{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        Set<Integer> arr = new HashSet<>();
        for(int i = 0 ; i < p ; i++){
            arr.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            arr.add(sc.nextInt());
        }

        int temp = 1;
        boolean flag = true;
        for(int i : arr){
            if(i != temp){
                System.out.println("Oh, my keyboard!");
                flag = false;
                break;
            }
            temp++;
        }
        if(flag && temp == n+1){
            System.out.println("I become the guy.");
        }
        else if(flag)
            System.out.println("Oh, my keyboard!");
            sc.close();}
}