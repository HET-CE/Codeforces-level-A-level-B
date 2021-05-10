import java.util.Scanner;

import java.util.Scanner;

public class Stones_on_the_Table{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int cn = 0;
        sc.nextLine();
        String str = sc.nextLine();
        for(int i = 0 ; i < str.length()-1 ; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cn++;
            }
        }
        System.out.println(cn);
    }
}