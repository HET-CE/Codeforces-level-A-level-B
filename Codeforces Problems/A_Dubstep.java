import java.util.Scanner;

public class A_Dubstep {
    
    static String curr ="";
    static boolean flag = true;
    static void solve(String str, int i){
        if(i > str.length()-1)
            return;
        if( i < str.length() && i+1 < str.length() && i+2 < str.length() && str.charAt(i) == 'W' && str.charAt(i+1)=='U' && str.charAt(i+2) == 'B'){
            i += 3;
            flag = false;
            solve(str, i);
        }
        else{
            if(curr != "" && flag == true){
                curr = curr +str.charAt(i);
            }
            else{
                curr = curr + " " + str.charAt(i);
            }
            flag = true;
            solve(str, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solve(str, 0);
        System.out.println(curr.substring(1));
        sc.close();
    }
}
