import java.util.Scanner;

public class B_Letter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String heading = sc.nextLine();
        String text = sc.nextLine();
        int headCharCapital[] = new int[26]; 
        int headCharSmall[] = new int[26]; 
        int textCharCapital[] = new int[26]; 
        int textCharSmall[] = new int[26]; 

        for(int i = 0 ; i < heading.length(); i++){
            if(heading.charAt(i) == ' ')
                continue;
            else if(heading.charAt(i) >= 'A' && heading.charAt(i) <= 'Z')
                headCharCapital[heading.charAt(i) - 'A']++;
            else
                headCharSmall[heading.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < text.length(); i++){
            if(text.charAt(i) == ' ')
                continue;
            else if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')
                textCharCapital[text.charAt(i) - 'A']++;
            else
                textCharSmall[text.charAt(i) - 'a']++;
        }

        boolean flag = true;
        for(int i = 0 ; i < 26 ; i++){
            if(textCharCapital[i] > headCharCapital[i]){
                System.out.println("NO");
                flag = false;
                break;
            }
            if(textCharSmall[i] > headCharSmall[i]){
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
    }
}

// Instead of dogging Your footsteps it disappears but you dont notice anything
// where is your dog