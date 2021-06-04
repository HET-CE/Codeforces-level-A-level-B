import java.util.Scanner; 
public class A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        sc.nextLine();
        int bit=0;
        for(int i = 0 ; i < n ; i++){
            str = sc.nextLine();
            if(str.contains(String.valueOf('+'))){
                ++bit;
            }
            else if(str.contains(String.valueOf('-')))
                --bit;
        }
        System.out.println(bit);
        sc.close();
    }
}
