import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;

public class B_Jeff_and_Periods {

    static boolean checker(int[] arr1, Integer[] arr2){
        int temp;
        ArrayList<Integer> tempArr = new ArrayList<>(arr1.length);
        
        for (int i = 0; i < arr2.length; i++) {
            temp = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == temp) {
                    tempArr.add(j);
                }
            }
            int index = tempArr.get(1) - tempArr.get(0);
            for(int k = 1 ; k < tempArr.size()-1 ; k++){
                if(tempArr.get(k+1) - tempArr.get(k) != index)
                    return false;
            }
            tempArr.clear();
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }

        int temp;
        boolean flag = false;
        int index1 = 0, index2 = 0;

        Integer[] arr2 = new Integer[set1.size()];
        set1.toArray(arr2);

        if (checker(arr, arr2)) {

            System.out.println(arr2.length);

            for (int i = 0; i < arr2.length; i++) {
                temp = arr2[i];
                flag = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == temp && flag == true) {
                        index2 = j;
                        flag = false;
                        break;
                    }
                    if (arr[j] == temp) {
                        index1 = j;
                        flag = true;
                    }
                }
                if (flag == true) {
                    System.out.println(temp + " " + "0");
                } else
                    System.out.println(temp + " " + Math.abs((index1 - index2)));
            }
        }
        sc.close(); }
}
