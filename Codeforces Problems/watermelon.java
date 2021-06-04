import java.util.Scanner;

public class watermelon{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int w = obj.nextInt();
        if(w == 2){
            System.out.println("NO");
        }
        else if(w%2 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        obj.close(); }
}