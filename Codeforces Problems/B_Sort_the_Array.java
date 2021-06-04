import java.util.Arrays;
import java.util.Scanner;

public class B_Sort_the_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr2);

        int front = 0, end = n - 1;
        boolean flag2 = true;
        if(front == end){
            flag2 = false;
            System.out.println("yes");
            System.out.println("1 1");
        }

        if (flag2) {
            while (true) {
                if (arr1[front] == arr2[front])
                    front++;
                if (arr1[end] == arr2[end])
                    end--;
                if (arr1[front] != arr2[front] && arr1[end] != arr2[end])
                    break;
                if (front >= end) {
                    flag2 = false;
                    System.out.println("yes");
                    System.out.println("1 1");
                    break;
                }

            }
        }
        if (flag2) {
            boolean flag = true;
            for (int i = front; i < end; i++) {
                if (arr1[i] < arr1[i + 1]) {
                    System.out.println("no");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
                System.out.println((front + 1) + " " + (end + 1));
            }
        }
    }
}
