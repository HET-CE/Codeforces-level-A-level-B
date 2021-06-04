import java.util.Scanner;

public class Beautiful_Year{
    
    static boolean distinct(int year){
        String str = String.valueOf(year);
        for(int i = 0 ; i < str.length()-1 ; i++){
            if(str.substring(i+1).contains(String.valueOf(str.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true){
            if(distinct(year+1)){
                System.out.println(year+1);
                break;
            }
            else
                year++;    
        }
        sc.close();}
}
