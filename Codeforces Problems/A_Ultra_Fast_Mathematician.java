import java.util.Scanner;

public class A_Ultra_Fast_Mathematician{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long num1 = sc.nextInt();
        // long num2 = sc.nextInt();

        String str1 = sc.nextLine();
        // sc.nextLine();
        String str2 = sc.nextLine();
        String ans = "";

        for(int i = 0 ; i < str1.length() ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                ans = ans + '1';
            }
            else
            ans = ans + '0';
        }
        System.out.println(ans);
    }
}

// 1010100
// 0100101