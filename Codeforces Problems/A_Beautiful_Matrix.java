import java.util.Scanner;

public class A_Beautiful_Matrix {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        Scanner sc = new Scanner(System.in);

        int r=0,c=0;
        for(int i = 0 ; i <= 4 ;i++){
            for(int j = 0; j <= 4 ;j++){
                mat[i][j] = sc.nextInt();
                if(mat[i][j] == 1){
                    r=i;
                    c=j;
                }
            }
        }
        System.out.println(Math.abs(r-2)+Math.abs(c-2));
        sc.close();
    }
}
