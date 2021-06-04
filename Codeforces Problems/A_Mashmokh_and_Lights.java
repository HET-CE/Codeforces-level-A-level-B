import java.util.Arrays;
import java.util.Scanner;

public class A_Mashmokh_and_Lights{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] lights = new int[n];
        Arrays.fill(lights, -1);
        
        int temp , last= n;
        for(int i = 0; i < m  ; i++){
            temp = sc.nextInt();
            if(temp - 1 > last)
                continue;
            Arrays.fill(lights, temp-1, last, temp);
            last = temp-1;
        }
        for(int i : lights)
            System.out.print(i + " ");
    }
}