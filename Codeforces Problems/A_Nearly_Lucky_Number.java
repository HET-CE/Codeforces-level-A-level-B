import java.util.Scanner;

public class A_Nearly_Lucky_Number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String str = String.valueOf(n);
        int cn = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '4' || str.charAt(i) == '7'){
                cn++;
            }
        }
        if(cn == 4 || cn == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close(); }
}
