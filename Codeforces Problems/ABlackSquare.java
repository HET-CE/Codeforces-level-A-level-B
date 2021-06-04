import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABlackSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.nextLine();
        Map<Character,Integer> m = new HashMap<>();

        String str = sc.nextLine();

        m.put('1', a);
        m.put('2', b);
        m.put('3', c);
        m.put('4', d);

        int sum = 0;
        for(int i = 0 ; i < str.length() ; i++){
            sum += m.get(str.charAt(i));
        }
        System.out.println(sum);
    }
}