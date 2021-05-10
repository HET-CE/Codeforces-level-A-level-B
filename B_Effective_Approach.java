import java.util.Scanner;

public class B_Effective_Approach {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arrele = new int[size];
        
        for(int i = 0 ; i < size ; i++){
            arrele[i] = sc.nextInt();
        }
        int no_query = sc.nextInt();
        int[] arrque = new int[no_query];
        sc.nextLine();
        for(int i = 0 ; i < no_query ; i++){
            arrque[i] = sc.nextInt();
        }
        int count_start = 0 , count_end = 0;

        for(int i = 0 ; i < no_query ; i++){
            int j = 0;
            for(j = 0 ; j < size ;j++){
                if(arrque[i] == arrele[j]){
                    count_start++;        
                    break;
                }
                else
                count_start++;    
            }
            count_end = count_end + (size - (j));           
        }
        System.out.print(count_start + " " + count_end);
    }
}