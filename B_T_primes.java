import java.util.Scanner;

public class B_T_primes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long num;
        long cn = 0;
        long temp ;
        long[] arr = new long[n];
        for(int i = 0; i < n ; i++){
            arr[i] =sc.nextLong();
        }
        for(int i = 0 ; i < n ; i++){
            num = arr[i];
            temp = 2;
            cn = 2;
            while( temp < (num)){
                if(num % temp == 0){
                    cn++;
                }
                if(cn == 4){
                    break;
                }
                temp++;
            }
            if(cn == 3){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}
// static String chartoNum(String str){

//     String ans = str.substring(0,2);
//     char z = ans.charAt(0);
//     char temp = ans.charAt(1);
//     int fin = 0;
//     while(true){
//         if(temp != '@'){
//             temp--;
//             fin++;
//         }
//         if(z == '@' && temp == '@')
//             break;
//         if(temp == '@'){
//             temp = 'Z';
//             z--;
//         }  
//     }
//     return  "R" + str.substring(str.length()-2) + "C" + fin;
// }


// static String numtoChar(String str){
//     int ans = Integer.parseInt(str.substring(str.length()-2));
//     char z = '@';
//     char temp = '@';
//     while(ans != 0){
//         if(z != 'Z')
//             z++;
//         if(z == 'Z'){
//             z = '@';
//             temp++; 
//         }    
//         ans--;
//     }
//     return String.valueOf(temp + "" + z) + "" + str.substring(1, 3); 
// }
