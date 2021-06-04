import java.util.Scanner;

public class A_I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int min = -1, max = -1;
        int num;
        int cn = 0;
        num = sc.nextInt();
        min = num;
        max = num;
        for(int i = 1 ; i < n ; i++){
            num = sc.nextInt();
            if(num > max){
                max = num;
                cn++;
            }
            else if(num < min){
                min = num;
                cn++;
            }
        }
        System.out.println(cn);
        sc.close(); }
}
