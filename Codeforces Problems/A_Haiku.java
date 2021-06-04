import java.util.Scanner;

public class A_Haiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        boolean flag = true;
        int cn = 0;
        for(int i = 0 ; i < str1.length() ; i++){
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' ||str1.charAt(i) == 'u'){
                cn++;
            }
        }
        if(cn != 5)
            flag = false;



        if(flag) {
            cn = 0;
            for(int i = 0 ; i < str2.length() ; i++){
                if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' ||str2.charAt(i) == 'u'){
                    cn++;
                }
            }
        }
        if(cn != 7)
            flag = false;



        if(flag) {
            cn = 0;
            for(int i = 0 ; i < str3.length() ; i++){
                if(str3.charAt(i) == 'a' || str3.charAt(i) == 'e' || str3.charAt(i) == 'i' || str3.charAt(i) == 'o' ||str3.charAt(i) == 'u'){
                    cn++;
                }
            }
        }
        if(cn != 5)
            flag = false;


        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
