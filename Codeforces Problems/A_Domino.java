import java.util.ArrayList;
import java.util.Scanner;

public class A_Domino {
    
    static boolean issum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            sum += arr.get(i);
        }
        if(sum % 2 == 0){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrX = new ArrayList<>();
        ArrayList<Integer> arrY = new ArrayList<>();

        int x,y;
        for(int i = 0 ; i < n ; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            arrX.add(x);
            arrY.add(y);
        }

        int cn = 0,temp;
        for(int i = 0 ; i < n ; i++){
            if(issum(arrX) && issum(arrY)){
                System.out.println(cn);
            }
            else{
                temp = arrX.get(i);
                arrX.set(i,arrY.get(i));
                arrY.set(i,temp);
                cn++;
                if(issum(arrX) && issum(arrY)){
                    System.out.println(cn);
                }
            }
        }
    
        sc.close();
    }
}
