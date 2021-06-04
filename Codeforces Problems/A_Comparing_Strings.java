import java.util.Scanner;

public class A_Comparing_Strings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String heading = sc.nextLine();
        String text = sc.nextLine();
        int headChar[] = new int[26]; 
        int textChar[] = new int[26];

        for(int i = 0 ; i < heading.length(); i++){
                headChar[heading.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < text.length(); i++){
                textChar[text.charAt(i) - 'a']++;
        }

        boolean flag = true;
        for(int i = 0 ; i < 26 ; i++){
            if(textChar[i] != headChar[i]){
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        
        int cn = 0;
        if(flag){
            for(int i = 0; i < heading.length() ; i++){
                if(heading.charAt(i) != text.charAt(i))
                    cn++;
                if(cn == 3){
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        }
        sc.close();
    }
}
// aabb
// bbaa