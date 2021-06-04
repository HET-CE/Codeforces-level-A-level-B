import java.util.Scanner;

public class Queue_at_the_School {
    
    static String swap(String str, int l, int r){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[l] ;
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }

    static String result(String str, int n){
        for(int i = 0 ; i < n-1 ; i++){
            if(str.charAt(i) == 'B' && str.charAt(i+1) == 'G'){
                str = swap(str, i, i+1);
                i += 2;
            }
            else
               i++;
        }
        return str;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        for(int j = 0 ; j < t ; j++){
            str = result(str, n);
        }
        System.out.println(str);
        sc.close();}
}
