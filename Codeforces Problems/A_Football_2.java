import java.util.Scanner;

public class A_Football_2 {
    
    static void solve(String str, int i){
        if(i > str.length()){
            System.out.println("NO");
            return;
        }
        if(i+7 <= str.length()  && !(str.substring(i, i+7).contains(String.valueOf('1')) && str.substring(i, i+7).contains(String.valueOf('0')))){
            System.out.println("YES");
            return;
        }
        else{
            i++;
            solve(str, i);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str  = sc.nextLine();
        solve(str,0);

    }
}
