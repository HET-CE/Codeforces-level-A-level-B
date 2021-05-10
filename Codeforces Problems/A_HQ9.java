import java.util.Scanner;

public class A_HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i;
        for(i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9'){
                System.out.println("YES");
                break;
            }
        }
        if(i == str.length())
            System.out.println("NO");
    }
}
