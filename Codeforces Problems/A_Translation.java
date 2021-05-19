import java.util.Scanner;

public class A_Translation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() == str2.length()){
            int i = 0,j = str2.length()-1;
            while (true) {
                if(i == str1.length()){
                    break;
                }
                if(str1.charAt(i) != str2.charAt(j)){
                    System.out.println("NO");
                    break;
                }
                else{
                    ++i;
                    --j;
                }
            }
            if(i == str1.length())
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
