import java.util.Scanner;

public class A_Gregs_Workout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }        

        int chest = 0;
        for(int i = 0 ; i < n ; i += 3){
            chest += arr[i];
        }
        
        int biceps = 0;
        for(int i = 1 ; i < n ; i += 3){
            biceps += arr[i];
        }
        
        int back = 0;
        for(int i = 2 ; i < n ; i += 3){
            back += arr[i];
        }

        if(chest > biceps && chest > back)
            System.out.println("chest");
        else if(biceps > chest && biceps > back)
            System.out.println("biceps");
        else if(back > chest && back > biceps)
            System.out.println("back");
    }
}
