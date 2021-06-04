import java.util.Scanner;

public class B_Polo_the_Penguin_and_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int[][] arr = new int[n][m];

        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        boolean flag = false;
        int cn = 0;
        // for(int i = min ; i <= max ; i++){
            for(int a = 0 ; a < n ; a++){
                for(int b = 0 ; b < m ; b++){
                    // if((arr[a][b]-i) / d != 0){
                            // Here we need to check is number i sfractional or not
                    // }
                    cn += (arr[a][b]-2) / d ;
                }
            }
        // }
        System.out.println(cn);
        sc.close();}
}
