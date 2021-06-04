import java.util.Scanner;

public class A_Arrival_of_the_General {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = 0,max_index = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
                max_index = i;
            }
            if(arr[i] <= min){
                min = arr[i]; 
                min_index = i;
            }      
        }

        int swap = 0;
        if(min_index > max_index){
            swap = Math.abs(0-max_index) + Math.abs(n-1-min_index);
        }
        else{
            swap = Math.abs(0-max_index) + Math.abs(n-1-min_index) - 1;
        }
        System.out.println(swap);
        sc.close();
    }
}
