import java.util.Scanner;

public class Spy_Detected{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        int size;
        int[] arr;
        
        for(int i = 1 ; i <= test_case ; i++){
            size = sc.nextInt();
            arr = new int[size];
            for(int j = 0 ; j < arr.length ; j++)
                arr[j] = sc.nextInt();

            if(arr[0] != arr[1]){
                if(arr[0] == arr[2]){
                    System.out.println(2);
                }
                else if(arr[1] == arr[2]){
                    System.out.println(1);
                }
            }
            
            else{
                for(int k = 2 ; k < arr.length ; k++){
                    if(arr[k] != arr[0]){
                        System.out.println(k+1);
                        break;
                    }    
                }
            }
        }
    }
}