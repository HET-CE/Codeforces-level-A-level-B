import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Helpful_Maths {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        ArrayList<Character> ch = new ArrayList<>(); 

        for(int i = 0 ; i < str.length() ; i+=2){
            ch.add(str.charAt(i));
        }
        Collections.sort(ch);
        for(int i = 1 ; i < str.length() -1 ; i+=2){
            ch.add(i, '+');
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character c: ch) {
            sb.append(c);
        }
        String string = sb.toString();
        System.out.println(string);
    }
}
