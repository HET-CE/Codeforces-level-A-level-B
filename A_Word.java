import java.util.Scanner;

public class A_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int CN = 0, cn = 0;

        for(int i = 0 ; i < str.length() ;i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                CN++;
            }
            else
                cn++;
        }
        if(CN > cn){
            str = str.toUpperCase();
            System.out.println(str);
        }
        else{
            str = str.toLowerCase();
            System.out.println(str);
        }    
    }
}
