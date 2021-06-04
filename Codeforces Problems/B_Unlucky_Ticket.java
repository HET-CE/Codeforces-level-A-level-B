import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Unlucky_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            arr1.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        for(int i = n ; i < 2*n ; i++){
            arr2.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }   

        // Collections.sort(arr1);
        // Collections.sort(arr2);

        boolean flag = true;
        int j;
        for(j = 0 ; j < n ; j++){
            if(arr1.get(j) > arr2.get(j)){
                System.out.println("YES");
                flag = false;
                break;
            }    
        }

        int k;
        for(k = 0 ; k < n ; k++){
            if(arr1.get(k) < arr2.get(k)){
                System.out.println("YES");
                flag = false;
                break;
            }    
        }

        if(flag)
            System.out.println("NO");

            sc.close(); }
}


// int len = num.length();
//         int[] arr = new int[len];
//         for (int index = 0; index < len; index++) {
//             arr[index] = num.charAt(index);
//         }