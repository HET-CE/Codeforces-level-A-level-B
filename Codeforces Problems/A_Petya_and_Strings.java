import java.util.Scanner;

public class A_Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();

        // str1.compareTo(str2);

        int ans = str1.compareToIgnoreCase(str2);

        if(ans < 0)
            System.out.println("-1");
        else if(ans == 0)
            System.out.println("0");
        else
            System.out.println("1");    
            sc.close(); }
}
