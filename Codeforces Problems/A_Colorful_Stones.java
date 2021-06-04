import java.util.Scanner;
public class A_Colorful_Stones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int i = 0,j = 0  ; 
        while(j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println(i+1);
    }
}
