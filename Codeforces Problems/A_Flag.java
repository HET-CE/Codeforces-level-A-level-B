import java.util.Scanner;

public class A_Flag {

    static boolean checker(int[] arr){
        for(int i : arr)
        System.out.println(i);


        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] != arr[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean flag = true, flag2 = true;
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();

            }
            if(!checker(arr[i])){
                flag = false;
                System.out.println("NO");
                break;
            }
        }
        if(flag){
            for(int i = 0 ; i < n-1 ;i++){
                if(arr[i][0] == arr[i+1][0]){
                    System.out.println("NO");
                    flag2 = false;
                    break;
                }
            }
        }
        if(flag && flag2)
            System.out.println("YES");
        System.out.println(flag +" "+flag2);
        sc.close();
    }
}

// 3 3
// 000
// 111
// 222

