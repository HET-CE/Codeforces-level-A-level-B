import java.util.Scanner;

public class AAandBchess{

    static int solve(char n){
        if(n == 'q' || n == 'Q'){
            return 9 ;
        }
        else if(n == 'r' || n == 'R'){
            return 5;
        }
        else if(n == 'b' || n == 'B'){
            return 3;
        }
        else if(n == 'n' || n == 'N'){
            return 3;
        }
        else if(n == 'p' || n == 'P'){
            return 1;
        }
        else if(n == 'k' || n == 'K'){
            return 0;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    String str[] = new String[8];
    for(int i = 0 ; i < 8 ; i++){
        str[i] = sc.nextLine();
    }
    int cn1 = 0, cn2 = 0;
    for(int i = 0 ; i < 8 ; i++){
        for(int j = 0 ; j < 8 ; j++){
            if(str[i].charAt(j) > 'A' && str[i].charAt(j) < 'Z'){
                cn1 += solve(str[i].charAt(j));
            }
            else
                cn2 += solve(str[i].charAt(j));
        }
    }
    if(cn1 > cn2)
    System.out.println("White");
    else if(cn1 < cn2)
    System.out.println("Black");
    else
    System.out.println("Draw");
}}