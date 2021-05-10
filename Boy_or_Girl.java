import java.util.ArrayList;
import java.util.Scanner;

public class Boy_or_Girl {

    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (!arr.contains(str.charAt(i))) {
                arr.add(str.charAt(i));
            }
        }

        if (arr.size() % 2 != 0)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
    }
}
