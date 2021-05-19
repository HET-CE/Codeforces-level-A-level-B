import java.util.Scanner;

public class A_Magic_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String str = String.valueOf(n);
        int i;
        int cn = 0;
        if(str.charAt(0) == '4'){
            System.out.println("NO");
        }
        else {
            for(i = 0; i < str.length(); i++){
                if(str.charAt(i) != '1' && str.charAt(i) != '4'){
                    System.out.println("NO");
                    break;
                }
                if(str.charAt(i) == '4')
                    cn++;
                if(cn==3){
                    System.out.println("NO");
                    break;
                }
                if(cn != 0 && str.charAt(i) == '1'){
                    cn = 0;
                }
            }
            if(i == str.length())
                System.out.println("YES");
        }
    }
}
