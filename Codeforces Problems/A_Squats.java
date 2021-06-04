import java.util.Scanner;

public class A_Squats {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int cx=0,cX=0;
        String str = sc.nextLine();
        for(int i = 0 ; i < n ; i++){
            if(str.charAt(i) == 'x')
                cx++;
            else
                cX++;
        }
        boolean flag = true;
        if(cx > cX){
            flag = true;
        }
        else{
            flag = false;
        }
        int q = Math.abs(cx - cX) / 2;
        int ans = 0;
        String newstr = "";
        // int p = 0;
        while(ans < n){
            if(str.charAt(ans)=='x' && flag && cx != cX){
                newstr += "X";
                cx--;
                cX++;
            }
            else if(str.charAt(ans)=='X' && !flag && cx != cX){
                newstr += "x";
                cx++;
                cX--;;
            }
            else
                newstr += str.charAt(ans);
            ans++;
        }
        System.out.println(q);
        System.out.println(newstr);
    }
}
