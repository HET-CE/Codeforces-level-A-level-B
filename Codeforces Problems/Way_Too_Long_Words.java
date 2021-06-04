import java.util.Scanner;

public class Way_Too_Long_Words {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String st;
        int cn;
        obj.nextLine();
        for(int i = 1 ; i <= n ; i++){
            st = obj.nextLine();
            cn = 0;
            for(int j = 1 ; j < st.length()-1 ; j++){
                cn++;
            }
            if(st.length() > 10)
                System.out.println(st.charAt(0) + ""+ cn + "" + st.charAt((st.length())-1));
            else
                System.out.println(st);
        }
        obj.close();}
}
