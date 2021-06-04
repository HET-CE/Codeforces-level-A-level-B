import java.util.Scanner;

public class A_Little_Elephant_and_Rozdil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i= 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        int j = 0;
        for(j = index +1 ; j < arr.length; j++){
            if(arr[j] == min){
                break;
            }
        }

        if(j == arr.length)
            System.out.println(++index);
        else
            System.out.println("Still Rozdil");
            sc.close(); }
}
