import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class A_Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String res = "";
        int n = sc.nextInt();
        int x,y;
        boolean flag = true;
        for(int i = 1; i <= n ; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if(s-x < 0){
                flag = false;
                res = "NO";
            }
            s += y;
        }
        if(flag)
            res = "YES";
        System.out.println(res);
    }
}
// 999 2
// 1010 10
// 67 89