import java.util.Scanner;

public class A_Petr_and_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        for(int i = 0 ; i < 7 ;i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;
        while(true){
            n = n - arr[i];
            if(n <= 0){
                System.out.println(i+1);
                break;
            }
            i++;
            if(i > 6)
                i = 0;
        }
        sc.close();  }    
}
// 50
// 10 1 10 1 10 1 10
