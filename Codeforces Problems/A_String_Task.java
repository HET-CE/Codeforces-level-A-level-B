import java.util.Scanner;

public class A_String_Task {

    static String curr = "";
    static void solve(String str, int i){
        if(i >= str.length()){
            return;
        }
        if(str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'y' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'i'){
            i++;
            solve(str, i);
        }
        else{
            curr = curr + "." + str.charAt(i);
            i++;
            solve(str, i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

        solve(str, 0);

        System.out.println(curr);
        sc.close(); }
}
