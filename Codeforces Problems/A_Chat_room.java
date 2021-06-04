import java.util.Scanner;

public class A_Chat_room {

    static char temp = 'h';
    static String curr = "NO";
    static int i1,i2,i3,i4;
    static void solve(String str, int i){
        if(str.contains(String.valueOf('h'))){
            
            // System.out.println("1c");
            i1 = str.indexOf('h');
            if(str.contains(String.valueOf('e')) && str.lastIndexOf('e') > i1){
            
                // System.out.println("2c");
                i2 = str.indexOf('e');
                if(str.contains(String.valueOf('l')) && str.lastIndexOf('l') > i2){
                    
                    // System.out.println("3c");
                    i3 = str.indexOf('l');
                    if(str.contains(String.valueOf('l')) && str.lastIndexOf('l') > i3){
                        
                        // System.out.println("4c");
                        i4 = str.indexOf('l');
                        if(str.contains(String.valueOf('o')) && str.lastIndexOf('o') > i4){
                            
                            // System.out.println("5c");
                            curr = "YES";
                            return;
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solve(str, 0);
        System.out.println(curr);
        sc.close();
    }
}
