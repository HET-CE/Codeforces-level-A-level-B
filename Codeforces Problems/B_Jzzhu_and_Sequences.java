import java.util.Scanner;
public class B_Jzzhu_and_Sequences {
    
    static int result;
    static int solve(int n, int x, int y){
        if(n == 2){
            return y;
        }
        if(n == 1){
            return x;
        }
        result = solve(n-1,x,y) - solve(n-2,x,y);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        int res = solve(n,x,y) % 1000000007;
        System.out.println(res);

        sc.close();}
}
