import java.util.Scanner;

public class A_Word_Capitalization {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = str.charAt(0);
        if(c >= 'a' && c <= 'z'){
            c = (char) (c - 32);
            str = c + str.substring(1);
        }
        System.out.println(str);
    }
}
